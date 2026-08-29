package springmvcsearch.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ExceptionHandlerCusto {
	
	@ResponseStatus(value=HttpStatus.BAD_REQUEST)
	@ExceptionHandler({NullPointerException.class, ArrayIndexOutOfBoundsException.class})
	public String exceptionHandlerNull() {
		return "nullpage";
	}
}
