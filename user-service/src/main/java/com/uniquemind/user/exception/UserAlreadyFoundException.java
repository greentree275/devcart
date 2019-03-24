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
@ResponseStatus(code=HttpStatus.BAD_REQUEST, reason="User ALready Exists")
public class UserAlreadyFoundException extends Exception{

}