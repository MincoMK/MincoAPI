package com.minco.java.exceptions;

import java.util.*;
import java.io.*;

/**
 * @author Minco
 * Basic Minco API Exception Class
 * Throwed On Exception Of Minco API
 * Have An Auto-Print-Stack Function
 */
public class MincoException extends Exception {
	public MincoException(String m) {
		super(m);
		this.printStackTrace();
	}
}
