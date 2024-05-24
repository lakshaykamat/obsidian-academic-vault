# Unit 3 Web Servers

# Web Server

A web server is a software program or a computer system that is responsible for accepting HTTP requests from clients, known as web browsers, and returning web pages in response. The web server listens for requests on a specific network port, typically port 80 for HTTP and port 443 for HTTPS (HTTP Secure), and uses the HTTP protocol to communicate with the client.

When a client (web browser) makes a request for a webpage, the web server processes the request and retrieves the requested webpage from its storage. The web server then sends the webpage back to the client along with relevant headers containing information about the content, such as its type and size. The web browser then renders the webpage on the user's device.

Web servers can also be used to host applications and services, such as a website or a web-based application. These applications can be built using various programming languages, such as Java, PHP, and Python, and are often run on the server side using a framework such as Ruby on Rails, Django or Express.js.

Web servers can be run on a variety of operating systems, such as Windows, Linux, and macOS. Some of the most popular web servers include Apache, Nginx, and Microsoft IIS. These servers are highly customizable and can be configured to serve specific needs such as high performance, security, or scalability.

# Web Server Working

A web server works by accepting and processing requests from clients, typically web browsers, and returning the appropriate response in the form of a web page. The process can be broken down into several steps:

1. A client, such as a web browser, sends a request to the web server by entering a URL (Uniform Resource Locator) into the address bar and pressing enter. The request is sent using the HTTP (Hypertext Transfer Protocol) or HTTPS (HTTP Secure).
2. The web server receives the request and processes it by determining the type of request and the appropriate action to take.
3. If the request is for a static web page, such as an HTML document, the web server retrieves the requested page from its storage and sends it back to the client.
4. If the request is for a dynamic web page, such as a webpage generated by a server-side script, the web server processes the script and generates the page on the fly before sending it back to the client.
5. The web server also sends additional information, called headers, along with the response. These headers provide information about the content, such as its type and size, as well as any additional instructions for the client, such as caching instructions.
6. The client, such as a web browser, receives the response and uses the information in the headers and the content of the response to render the web page on the user's device.
7. The server also stores the logs of the requests and responses, which can be used for monitoring and troubleshooting purposes.

This process happens every time a client makes a request to the web server, and it can handle multiple requests simultaneously, that's why web servers are designed to be highly concurrent and able to handle a large number of requests at the same time.

[data:image/svg+xml,%3csvg%20xmlns=%27http://www.w3.org/2000/svg%27%20version=%271.1%27%20width=%2730%27%20height=%2730%27/%3e](data:image/svg+xml,%3csvg%20xmlns=%27http://www.w3.org/2000/svg%27%20version=%271.1%27%20width=%2730%27%20height=%2730%27/%3e)

# Apache

Apache is a popular open-source web server software that is widely used for hosting websites and web-based applications. It is developed and maintained by the Apache Software Foundation and is known for its flexibility, security, and scalability.

Additionally, Apache can be easily configured to handle high traffic and can be scaled to handle a large number of concurrent connections, making it suitable for high-traffic websites and web-based applications.

One of the key features of Apache is its support for the use of modules, which are add-ons that can be installed to extend the functionality of the server.
Apache is widely used and supported by a large community of developers and users, and it is considered one of the most stable and reliable web servers available.

## Features

1. Multi-Platform support: Apache can run on a variety of operating systems, including Windows, Linux, and macOS.
2. Modularity: Apache has a modular design, which allows for the easy addition and removal of features through the use of modules. This allows for a high level of customization and flexibility.
3. Support for multiple languages: Apache supports a wide range of programming languages, including HTML, CSS, JavaScript, PHP, and Python, and can be integrated with various web development frameworks and technologies such as Ruby on Rails, Django and Express.js.
4. Virtual Hosting: Apache supports virtual hosting, which allows a single web server to host multiple websites on different domains and IP addresses.
5. Security: Apache offers a variety of security features, such as support for Secure Sockets Layer (SSL) and Transport Layer Security (TLS) for encryption, and the ability to configure access controls and authentication.
6. URL Rewriting: Apache has a built-in module called mod_rewrite that allows for URL rewriting, which can be used to change the appearance of URLs, redirect requests, and more.
7. Performance: Apache can be easily configured to handle high traffic and can be scaled to handle a large

# PWS

PWS (Personal Web Server) is a web server software that was developed by Microsoft for use on personal computers running the Windows operating system. It was included with several versions of Windows, including Windows 95 and Windows NT, and was designed to make it easy for users to create and host their own websites on their personal computers.

PWS was a lightweight web server that supported the basic features of a web server, such as serving static HTML pages and providing basic authentication.

PWS was a good option for personal use and small web sites, but it was not intended for use on production environments, it lacked many features that are required for a production web server, such as security, scalability, and performance.

In later versions of Windows, PWS was replaced by IIS (Internet Information Services), which is a more robust and powerful web server software that is still included with Windows today. However, PWS is not supported anymore and it is not recommended to be used in any production environment.

# IIS

IIS (Internet Information Services) is a web server software developed by Microsoft and is included with the Windows operating system. It is used to host websites and web-based applications on Windows servers and it's intended for production environments.

IIS can be easily configured to handle high traffic and can be scaled to handle a large number of concurrent connections, making it suitable for high-traffic websites and web-based applications.

IIS also has a user-friendly graphical interface called the Internet Information Services Manager, which allows administrators to easily configure and manage the server.

In conclusion, IIS is a powerful web server software that is intended for production environments and can handle a wide range of web-based applications and services. It is well suited for Windows-based environments and offers a variety of features that can be customized to meet specific needs.

## Features

1. **Multi-Platform support:** IIS can run on various version of windows and it is included with the Windows operating system.
2. **Support for multiple languages:** IIS supports a wide range of programming languages, including HTML, CSS, JavaScript, PHP, and ASP.NET.
3. **Virtual Hosting:** IIS supports virtual hosting, which allows a single web server to host multiple websites on different domains and IP addresses.
4. **Web-based Management Interface:** IIS has a user-friendly graphical interface called the Internet Information Services Manager, which allows administrators to easily configure and manage the server.
5. **Security:** IIS offers a variety of security features, such as built-in support for SSL and TSL encryption, as well as support for access controls and authentication.
6. **URL Rewriting:** IIS has a built-in support for URL rewriting, which can be used to change the appearance of URLs, redirect requests, and more.
7. **Performance:** IIS is designed to handle high traffic and can be scaled to handle a large number of concurrent connections, making it suitable for high-traffic websites and web-based applications.
8. **Deployment and Maintenance:** IIS has several tools for deployment and maintenance, such as Web Deploy, which makes it easy to deploy and synchronize web applications to multiple servers.
9. **Active Directory integration:** IIS can be integrated with Active Directory, which allows for centralized user management and authentication.
10. **Reverse proxy and load balancing:** IIS can be used as a reverse proxy and load balancing solution, which allows it to distribute requests to multiple servers based on different rules and conditions.

# Accessing Web Server

There are several ways to access a web server, depending on the type of server and the network configuration. The most common ways to access a web server include:

1. **Using a web browser:** The most common way to access a web server is by using a web browser, such as Google Chrome, Firefox, or Safari. To access a website hosted on a web server, you simply need to enter the website's URL (Uniform Resource Locator) into the address bar of the browser and press enter. The browser will then send a request to the web server and the server will respond with the requested webpage.
2. **Using an IP address:** If a website is hosted on a web server, it can also be accessed by using the server's IP address. To do this, you would enter the IP address of the server into the address bar of a web browser, and then the server will respond with the default webpage.
3. **FTP (File Transfer Protocol):** FTP is a protocol used to transfer files between a client and a server. FTP clients, such as FileZilla, can be used to connect to a web server and upload or download files.
4. **Remote Desktop:** Remote Desktop allows you to connect to a server remotely and use it as if you were physically sitting in front of it. Remote Desktop can be used to connect to a web server, allowing you to manage and configure the server remotely.
5. **SSH (Secure Shell):** SSH is a protocol used to remotely access and manage servers. SSH clients, such as PuTTY, can be used to connect to a web server and execute commands on the server.

These are the most common ways to access a web server, but there may be other ways depending on the specific server and network configuration. It's important to note that in order to access a web server, you need to have the appropriate access rights, such as a valid username and password.