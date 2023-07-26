package com.data.j8coding;

public class StBuffer {

	public static void main(String[] args)
	{
		// StringBuffer
		StringBuffer sb = new StringBuffer();
					sb.append(false);
					sb.append(0);
					sb.append("True");
					System.out.println(sb);
					
		StringBuilder sbl = new StringBuilder();
					sbl.append(sbl);
					sbl.append("StringBuilder");
					sbl.append("StringBuild");
					System.out.println(sbl);
		
	}

}
