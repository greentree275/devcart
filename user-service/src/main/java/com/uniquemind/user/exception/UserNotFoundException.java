/**
 * 
 */
package com.uniquemind.user.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author Nag	
 *
 */
@SuppressWarnings("serial")
@ResponseStatus(code=HttpStatus.NOT_FOUND, reason = "User not found")
public class UserNotFoundException extends Exception{

}
