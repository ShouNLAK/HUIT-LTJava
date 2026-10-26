package Demo_1;

import java.net.URL;

public class ParseURL {
    static void main() throws Exception {
        URL aURL = new URL("http://example.com:80/docx/books/tutorial" + "/index.html?name=networking#DOWNLOADING");
        System.out.println("Protocol : " +aURL.getProtocol());
        System.out.println("Authority : " +aURL.getAuthority());
        System.out.println("Host : " + aURL.getHost());
        System.out.println("Port : " + aURL.getPort());
        System.out.println("Path : " + aURL.getPath());
        System.out.println("Query : " + aURL.getQuery());
        System.out.println("Filename : " + aURL.getFile());
        System.out.println("Ref : " + aURL.getRef());
    }
}
