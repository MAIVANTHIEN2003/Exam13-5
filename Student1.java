package Exam;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Student1 {
    private  static final String Student_File_Name = "Studen.dat";
    public void doc(List<Student> studentList) throws IOException{
        FileInputStream fs = null;
        ObjectInputStream os = null;
        doc(studentList);
        try {
            fs = new FileInputStream(new File(Student_File_Name));
            os = new ObjectInputStream(fs);
            doc(studentList);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            closeStream(fs);
            closeStream(os);
        }
    }
    public List<Student> water(){
        List<Student> studentList = new ArrayList<>();
        FileInputStream fs = null;
        ObjectInputStream is = null;
        try {
            fs = new FileInputStream(new File(Student_File_Name));
            is = new ObjectInputStream(fs);
            studentList = (List<Student>) is.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            closeStream(fs);
            closeStream(is);
        }


        return studentList;
    }
    private void closeStream(InputStream is){
        if (is != null) {
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    private void closeStream(OutputStream os){
        if (os != null) {
            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


}
