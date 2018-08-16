package com.matt.springframework.beans.io;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class URLResource implements Resource{

	private URL url;

	public URLResource(URL url) {
		this.url = url;
	}

	@Override
	public InputStream getInputStream() throws IOException {
		URLConnection urlConnection = this.url.openConnection();
		urlConnection.connect();
		return urlConnection.getInputStream();
	}

}
