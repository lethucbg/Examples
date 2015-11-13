/** 
 * Copyright (c) 2014 ThucLV . All rights reserved. 
 *  
 * This file is part of Examples. 
 * com.tvd.gameview.ext is free eclipse plug-in: you can redistribute it and/or modify 
 * it under the terms of the GNU General Public License as published by 
 * the Free Software Foundation, either version 3 of the License, or 
 * (at your option) any later version. 
 * 
 * Examples is distributed in the hope that it will be useful, 
 * but WITHOUT ANY WARRANTY; without even the implied warranty of 
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the 
 * GNU General Public License for more details. 
 * 
 * You should have received a copy of the GNU General Public License 
 * along with Example.  If not, see <http://www.gnu.org/licenses/>. 
 */
package com.examples;

public class BuilderAndBuffer {
	public static void main(String[] args) {
		StringBuilder strBuilder = new StringBuilder("Hello");
		long time = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			strBuilder.append("World");
		}
		System.out.println("Time to process with StringBuilder is: "
				+ ((System.currentTimeMillis() - time)));
		StringBuffer strBuffer = new StringBuffer("Hello");
		long time1 = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			strBuffer.append("World");
		}
		System.out.println("Time to process with StringBuffer is: "
				+ ((System.currentTimeMillis() - time1)));
	}
}
