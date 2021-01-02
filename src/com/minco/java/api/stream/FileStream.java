package com.minco.java.api.stream;

import java.util.*;
import java.io.*;
import com.minco.java.exceptions.*;

/**
 * @author MincoMK
 * FileStream Class By Minco
 * Have Functions About ObjectOutputStream, ObjectInputStream
 */
public class FileStream {
	File f;
	public FileStream(File f) {
		this.f = f;
	}
	
	/**
	 * @author Minco
	 * @param o Object For Serialize
	 * Serialize Object
	 */
	public void serializeObject(Object o) throws MincoIOException {
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
			oos.writeObject(o);
			oos.flush();
			oos.close();
		} catch (IOException e) {
			throw new MincoIOException("IOException" + e.toString());
		}
	}

	/**
	 * @author Minco
	 * @return De-Serialized Object
	 * De-Serialize Object
	 * You Need Same Class To De-Serialize
	 */
	public Object deserializeObject() throws MincoIOException, MincoClassNotFoundException {
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f));
			Object o = ois.readObject();
			return o;
		} catch (IOException e) {
			throw new MincoIOException("IOException\n" + e.toString());
		} catch (ClassNotFoundException e1) {
			throw new MincoClassNotFoundException("ClassNotFoundException" + e1.toString());
		}
	}

}
