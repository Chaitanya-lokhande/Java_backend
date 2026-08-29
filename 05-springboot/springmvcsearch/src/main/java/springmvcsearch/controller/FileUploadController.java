package springmvcsearch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartResolver;

@Controller
public class FileUploadController {

	@RequestMapping("/fileupload")
	public String showUploadForm() {
		System.out.println("This is form handler....");
		String str = null;
		System.out.println(str.length());
		
		return "fileform";
	}
	
	@RequestMapping(path="uploadfile", method= RequestMethod.POST)
	public String fileUpload(@RequestParam("profile") MultipartResolver multipartResolver) {
		
		
		return "fileSuccess";
	}
	
	@ExceptionHandler({NullPointerException.class, ArrayIndexOutOfBoundsException.class})
	public String exceptionHandlerNull() {
		return "nullpage";
	}
}
