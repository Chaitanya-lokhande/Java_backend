package com.springrestapi.book.helper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class FileUploadHelper {
    
    // public final String uploadDir = "D:\\dev\\java-backend-practice\\05-springboot\\springrestbook\\src\\main\\resources\\static\\image";
    public final String uploadDir = new ClassPathResource("static/image").getFile().getAbsolutePath();

    public FileUploadHelper() throws IOException{

    }

    public boolean uploadFile(MultipartFile file){

        boolean f = false;

        try{
        //    InputStream is = file.getInputStream();
        //    byte data[] = new byte[is.available()];
        //    is.read(data);

        //    FileOutputStream fos = new FileOutputStream(uploadDir + File.separator + file.getOriginalFilename());
        //    fos.write(data);

        //    fos.flush();
        //    fos.close();

        Files.copy(file.getInputStream(),Paths.get(uploadDir + File.separator + file.getOriginalFilename()), StandardCopyOption.REPLACE_EXISTING);
        f=true;

        }
        catch(Exception e){
            e.printStackTrace();
        }

        return f;

    }
}
