package exceptions;

import java.io.IOException;

public class ThrowingExceptions {

		public static void main(String[] args) throws IOException {
			IOException x = new IOException("Input/Output Exception");
			throw x;
		}
}
