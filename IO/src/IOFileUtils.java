import java.io.*;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @BelongsProject: JavaAdvancedPrj
 * @BelongsPackage: PACKAGE_NAME
 * @Author: ZhangZhaoru
 * @Date: 2021/5/5 10:37 上午
 * @Description:
 */
public class IOFileUtils {
    //    创建文件
    public static void createFile(String path, String fileName) throws IOException {
        File file = new File(path + File.separator + fileName);
        if (file.isFile() && !file.exists()) {
            file.createNewFile();
        }
    }

    //    创建文件夹
    public void createDir(String path) {
        File file = new File(path);
        if (file.isDirectory() && !file.exists()) {
            file.mkdirs();
//            若根目录不存在则创建根目录
        }
    }

    /**
     * 先根遍历序递归删除文件夹
     *
     * @param dirFile 要被删除的文件或者目录
     * @return 删除成功返回true, 否则返回false
     */
    public static boolean deleteFile(File dirFile) {

        // 如果dir对应的文件不存在，则退出
        if (!dirFile.exists()) {
            return false;
        }
        if (dirFile.isFile()) {
            return dirFile.delete();
        } else {

            for (File file : dirFile.listFiles()) {
                deleteFile(file);
            }
        }
        return dirFile.delete();
    }

    // 使用自定义缓存数组实现字符流读取文件
    public static String fileCharRead(String filePath) {
        String res = null;
        FileReader fileReader = null;
        try {
            File file = new File(filePath);
            if (file.exists() && file.isFile()) {
                fileReader = new FileReader(file);
                //            创建缓存数组
                char[] buf = new char[1024];
                int len;
                while ((len = fileReader.read(buf)) != -1) {
                    res = res + new String(buf, 0, len);
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return res;
    }

    // 使用自定义缓存数组实现字符流写入文件
    public static void fileCharWrite(String filePath, String str) {
        String res = null;
        FileWriter fileWriter = null;
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                createFile(file.getParent(), file.getName());
            }

            if (file.exists() && file.isFile()) {
                fileWriter = new FileWriter(file, false);
                fileWriter.write(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }

}
