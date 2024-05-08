# Unit 1 Electronic Mail and Internet

# Email

An email, short for "electronic mail," is a means of communicating digitally via the internet or other computer networks. Emails are composed and sent as a message, and can include text, images, files, and other attachments. Email addresses are used to identify the sender and recipient of an email, and messages can be sent and received on computers, smartphones, and other digital devices. Email is one of the most widely used forms of digital communication and has become a vital tool for both personal and professional communication.

## Advantages

Email has several advantages over other forms of communication, such as:

1. **Convenience:** Emails can be sent and received at any time, from anywhere, and can be stored and accessed later.
2. **Speed:** Emails are typically delivered within seconds or minutes, allowing for quick and efficient communication.
3. **Cost-effective:** Sending an email is much cheaper than traditional mail or making a phone call.
4. **Document sharing:** Email allows easy sharing and transfer of documents, images, and other files.
5. **Archiving:** Emails can be easily archived and searched, making it easy to find specific information or conversations.
    1. **Global reach:** Email allows people to communicate with others from all over the world, making it a powerful tool for global business and personal relationships.
6. **Formal and informal communication:** Email can be used for formal communication such as official correspondence and informal communication such as casual conversation.
7. **Increased productivity:** Email allows for the rapid exchange of information and coordination of tasks, which can increase productivity in a business setting.

## Disadvantages

While email is a very useful tool, it also has some disadvantages, such as:

1. **Overload:** With the increasing number of emails sent and received daily, it can be overwhelming to manage and respond to them all.
2. **Lack of context:** Emails lack the nonverbal cues and tone of voice that are present in face-to-face or phone conversations, which can lead to misunderstandings.
3. **Security:** Emails can be easily hacked, and sensitive information can be stolen or compromised if not properly protected.
4. **Spam:** A large number of unwanted emails, known as spam, can clog up inboxes and make it difficult to find important messages.
5. **Impersonation:** Scammers and hackers can use email to impersonate others, leading to phishing attacks and other malicious activities.
6. **Lack of privacy:** Email can be easily forwarded or copied, which means that private information shared via email may not stay private.
7. **Miscommunication:** Email is a text-based medium, which means that it can be hard to convey emotions or tone, and also it can be misinterpreted by the reader.
8. **Permanent record:** Emails leave a permanent record, which can be used as evidence in legal proceedings or cause problems if the content of the email is inappropriate or unprofessional.

# How Email Works

Email works by using a combination of different technologies and protocols to send and receive messages electronically. The basic process can be broken down into several steps:

1. The sender composes a message using an email client, which is a software program or web-based service that allows users to send and receive emails.
2. The email client then connects to an email server using the Simple Mail Transfer Protocol (SMTP) to send the message.
3. The email server, which is a computer that manages and stores email messages, then forwards the message to the recipient's email server.
4. The recipient's email server then uses the Post Office Protocol (POP) or the Internet Message Access Protocol (IMAP) to download the message to the recipient's email client.
5. The recipient can then read the message on their email client.
6. Reply: If the recipient wants to reply to the message, they can compose a new message and send it back to the sender's email server using the same process.

In addition to SMTP and POP/IMAP, there are other protocols and technologies used in email, such as Secure Sockets Layer (SSL) and Transport Layer Security (TLS) for encryption, and Domain Name System (DNS) for resolving email addresses to the correct email server.

All the emails are stored in the email servers, which is a computer system that stores the emails, and it can be accessed by the email client, web-based email services or mobile email apps.

# Email Protocols

## SMTP

- SMTP stands for Simple Mail Transfer Protocol.
- SMTP is a set of communication guidelines that allow software to transmit an electronic mail over the internet is called **Simple Mail Transfer Protocol**.
- It is a program used for sending messages to other computer users based on e-mail addresses.
- It provides a mail exchange between users on the same or different computers, and it also supports:
    - It can send a single message to one or more recipients.
    - Sending message can include text, voice, video or graphics.
    - It can also send the messages on networks outside the internet.
- The main purpose of SMTP is used to set up communication rules
between servers. The servers have a way of identifying themselves and
announcing what kind of communication they are trying to perform. They
also have a way of handling the errors such as incorrect email address.
For example, if the recipient address is wrong, then receiving server
reply with an error message of some kind.

## IMAP

IMAP (Internet Message Access Protocol) is a standard protocol for retrieving email messages from a mail server. It allows users to access their email messages and manage their mailboxes, such as creating, deleting, and renaming folders, from multiple devices and locations.

IMAP is a more advanced protocol than POP3, it allows users to access their mailboxes from multiple devices and keeps the messages on the server, so it's possible to access the same mailbox from multiple devices without having to download the messages again.

### Advantages

1. **Access to multiple mailboxes:** IMAP allows users to access multiple mailboxes on a server, such as the inbox, sent items, and custom created folders.
2. **Synchronization:** IMAP allows multiple devices to access the same mailbox and keeps the messages in sync across all devices, so the user can access the same email messages from multiple devices.
3. **Server-side message management:** IMAP allows users to manipulate messages and folders on the server, such as moving, deleting, and copying messages, as well as creating, renaming, and deleting folders.
4. **Search capability:** IMAP allows users to search for messages on the server by keywords, sender, recipient, and other criteria.
5. **Push email:** IMAP supports push email, which means that new messages can be delivered to the client as soon as they arrive on the server, without the need for the client to periodically check for new messages.
6. **Support for large attachments:** IMAP supports sending and receiving large attachments, such as videos and images.
7. **Security:** IMAP supports secure connections using the Transport Layer Security (TLS) and Secure Sockets Layer (SSL) protocols to encrypt the communication between the client and the server.
8. **Message flags:** IMAP has the capability to set flags on messages, like read, unread, deleted, and more, this allows to easily sort, filter and manage your email.
9. **IDLE:** IMAP has the capability to keep a connection open and receive notifications of new messages arriving in the mailbox in real time.

### Disadvantages

1. IMAP requires more storage space on the server than POP3, as it keeps the messages on the server.
2. IMAP requires a constant connection to the server, which can lead to a slower response time and a higher risk of disconnections.
3. IMAP requires more resources on the client device to keep the messages in sync.
4. IMAP may not be compatible with some older email clients or devices.

## POP 3

POP3 (Post Office Protocol version 3) is a standard protocol for retrieving email messages from a mail server. It is a simpler and older protocol than IMAP. POP3 is designed to download email messages from a server to a single computer, and then delete the messages from the server.

POP3 is a simpler protocol than IMAP, it's mainly used for devices that will download the messages and store them locally, like personal computers. It's not suitable for devices that should keep the email messages on the server, like smartphones or tablets, because it will delete the messages from the server once they are downloaded.

### Advantages

1. **Simple:** POP3 is a simple protocol that is easy to implement and use.
2. **Low server requirements:** POP3 requires less storage space on the server than IMAP.
3. **Offline access:** POP3 allows users to download messages to their computer, and then read and respond to them offline.
4. **Low resource usage:** POP3 requires fewer resources on the client device than IMAP.

### Disadvantages

1. **Limited device support:** POP3 is designed for use with a single computer, and does not support multiple devices or synchronization.
2. **Limited message management:** POP3 does not provide the same level of server-side message management as IMAP.
3. **Limited search capability:** POP3 does not have built-in search capabilities like IMAP.
4. **No push email:** POP3 does not support push email, so new messages are not delivered in real-time.
5. **Delete from server:** POP3 will delete messages from the server once they are downloaded, this could lead to issues if the user wants to access the same email on another device or if the email client crashes.
6. **Security issues:** POP3 is not a secure protocol, it can be intercepted by an attacker and therefore it's recommended to use secure connections like TLS or SSL.

## Difference Between IMAP and POP 3

## MIME

MIME (Multipurpose Internet Mail Extensions) is a standard that extends the format of email messages to support text in character sets other than ASCII, as well as attachments of audio, video, images, and application programs.

MIME is an essential part of the email system and it enables the sending and receiving of rich-content email messages, which can include text, images, audio, and video. It makes it possible for users to send and receive messages with multimedia and other files, and it is also used in web pages, instant messaging, and other applications that use similar types of multimedia content.

### Types

MIME types, also known as media types or content types, are a way of specifying the format of a file that is being sent over the internet, such as an email attachment or a file on a web page.

Examples of MIME types include:

- text/plain: plain text file
- image/jpeg: JPEG image file
- image/png: PNG image file
- audio/mpeg: MPEG audio file
- video/mp4: MP4 video file
- application/pdf: PDF document
- application/msword: Microsoft Word document
- application/vnd.ms-excel: Microsoft Excel document

# News Groups

Newsgroups, also known as Usenet groups or simply groups, are a way for users to share information and communicate with each other using a distributed discussion system.

Newsgroups are organized into a hierarchy of categories, with each group having a unique name that identifies its category and topic. For example, the group "comp.os.linux.announce" is in the "comp" (computer) category and covers announcements about the Linux operating system.

Users can post messages to a newsgroup, which are then distributed to all the servers in the Usenet network. Other users can then read and respond to these messages. 

Newsgroups can be used for discussion on a wide range of topics, such as technology, politics, hobbies, and more.

Newsgroups have been largely replaced by other forms of online discussion, such as forums, mailing lists, and social media, but some still exist and are used by communities that prefer the more traditional and decentralized approach of newsgroups.

It's worth noting that while they can be used to share information and communicate with others, newsgroups can also be a source of spam, misinformation, and offensive content and it's important to use them with caution.

# Mailing List

A mailing list is a collection of email addresses used to send messages to multiple recipients. Mailing lists are typically used to send information or updates to a group of people who have opted in to receive email from the list.

There are two main types of mailing lists:

1. **Announcement lists:** These mailing lists are used to send out announcements, such as news, updates, or events. Subscribers to an announcement list typically receive messages on a regular basis, but they don't have the ability to send messages to the list.
2. **Discussion lists:** These mailing lists allow subscribers to send messages to the list, and these messages are then distributed to all subscribers. Discussion lists are used for group discussion and communication, and can cover a wide range of topics.

# Chat Rooms

Chat rooms, also known as chat forums or discussion boards, are online spaces where people can communicate in real-time through text-based messages. Chat rooms are typically organized around a specific topic or theme, and users can join and leave the room as they wish.

Chat rooms are often accessed through a web browser or a dedicated chat client, and users typically choose a username or handle to represent themselves in the room. Some chat rooms also support the use of avatars, emoticons, and other forms of rich media.

Chat rooms can be moderated or unmoderated, and can be open to the public or restricted to a private group. Some chat rooms are moderated to ensure that the conversation stays on topic and that users follow certain guidelines.

Chat rooms have been around for a long time, and they were popular in the early days of the internet. However, they have largely been replaced by other forms of online communication, such as instant messaging and social media.

It's worth noting that chat rooms can be a source of spam, misinformation, and offensive content. It's important to use them with caution and be aware of the potential risks, such as cyberbullying, harassment and exposing personal information.

# Email fields

An email message typically includes several fields or components that provide information about the sender, recipient, and message content. The most common fields include:

1. **To:** This field is used to specify the primary recipient of the email. It can include multiple email addresses separated by commas.
2. **CC (Carbon Copy):** This field is used to specify additional recipients who should receive a copy of the email.
3. **BCC (Blind Carbon Copy):** This field is similar to CC, but the recipients in the BCC field are not visible to the other recipients of the email.
4. **From:** This field displays the sender's email address, and it is automatically filled by the email client when the message is composed.
5. **Subject:** This field is used to specify a brief summary or subject of the email.
6. **Body:** This is the main content of the email, and it can include text, images, files, and other attachments.
7. **Date:** This field displays the date and time when the email was sent.
8. **Reply-To:** This field specifies an email address to which the recipients should send their reply.
9. **Signature:** This is an optional field that can be used to include a signature or disclaimer at the end of the email message.
10. **Attachments:** This field is used to attach files, images, and other documents to the email message.

These are the most common fields that you will find in an email, but depending on the email client, the email service or the mail server, there may be other fields available or other features that can be used to customize the email message.

# User ID and Password

A user ID and password are commonly used forms of authentication, which are used to confirm the identity of a user before granting access to a system or application.

A user ID is a unique identifier that is assigned to a user, which is used to identify the user within the system or application. It is typically a string of alphanumeric characters, such as a username or an email address.

A password is a secret string of characters that is used in combination with a user ID to confirm the identity of a user. Passwords are typically kept confidential and are only known to the user and the system or application.

## User ID and Password Rules

### User ID

- User IDs must be 7-14 characters
- User IDs must contain at least one letter; numbers are allowed, but not required
- User IDs cannot contain spaces
- User IDs cannot contain your Social Security Number, Tax Identification Number, or Customer Access Number
- No special characters are allowed, such as: ! @ # $ % ^ &
- Use of an underscore is allowed but not required: _
- Do not use your Password as your User ID

### Password

- Passwords must be 7-14 characters
- Passwords must include at least one letter and one number
- Passwords cannot contain spaces
- Semicolons cannot be part of a Password
- Passwords are case-sensitive
- Do not use your User ID as your Password

# Introduction to Network and Internet

A network is a collection of interconnected devices, such as computers, servers, and routers, that are connected together to share resources and exchange information. The Internet is a global network of networks that connects millions of devices around the world, allowing them to share information and communicate with each other.

The Internet is built on a set of protocols, such as TCP/IP, that define how data is transmitted and received over the network. These protocols allow devices to communicate with each other, regardless of their location or the type of device they are using.

# Computer Networks

1. **Local Area Network (LAN):** A LAN is a network that connects devices in a small geographic area, such as a home, office, or building. LANs are typically used to share resources, such as printers and files, among devices in the same location.
2. **Wide Area Network (WAN):** A WAN is a network that connects devices over a larger geographic area, such as a city, region, or country. WANs are typically used to connect LANs together, allowing devices in different locations to communicate with each other.
3. **Metropolitan Area Network (MAN):** A MAN is a network that connects devices in a metropolitan area, such as a city. It connects multiple LANs and WANs, and it is typically owned and operated by a single entity, such as a government or telecommunications company.
4. **Wireless Local Area Network (WLAN):** A WLAN is a LAN that uses wireless technology, such as Wi-Fi, to connect devices. WLANs are convenient because they do not require physical cables, but they may have limited range and security concerns.
5. **Virtual Private Network (VPN):** A VPN is a network that uses encryption to create a secure connection between devices over a public network, such as the internet. VPNs are typically used to provide remote access to a private network, such as a company's internal network.
6. **Personal Area Network (PAN): P**ersonal area network (PAN) is a computer network used for communication among computer and different information technological devices close to one person. Some examples of devices that are used in a PAN are personal computers, printers, fax machines, telephones, PDAs, scanners, and even video game consoles
7. **Internetwork:** Internetwork is the connection of two or more private computer networks via a common routing technology (OSI Layer 3) using router
8. **Intranets:** An intranet is a private network that is used within an organization to share information and resources among employees. An intranet uses the same technologies as the internet, such as the TCP/IP protocol, but it is only accessible to authorized users within the organization.
9. **Extranet:** An extranet is a private network that is used to share information and resources among a specific group of people outside of an organization. An extranet uses the same technologies as the internet, such as the TCP/IP protocol, but it is only accessible to authorized users outside of the organization who have been granted access.

# Working of Internet

When a device, such as a computer or a smartphone, wants to communicate with another device over the Internet, it first needs to establish a connection. This is typically done using a protocol called Transmission Control Protocol (TCP), which establishes a virtual connection between the two devices.

Once the connection is established, the device can then send data to the other device using the Internet Protocol (IP). *IP is responsible for routing the data to its destination, by breaking it down into small packets, called datagrams, and sending them through the network*.

The packets are then passed from one network to another, until they reach their destination. Each packet contains a header that includes information such as the source and destination addresses, as well as the packet's position in the overall message.

At the destination, the packets are reassembled into the original message and the data is delivered to the intended recipient.

# Internet Congestion

Internet congestion refers to the situation when the amount of data trying to travel through a network exceeds the capacity of the network to handle it. This can happen when too many devices are trying to access the internet at the same time, or when there is a bottleneck in the network infrastructure.

When there is congestion on the Internet, packets of data may be delayed or dropped, leading to slow performance and reduced quality of service. This can manifest in different ways, such as:

1. **Slow page load times:** When there is congestion on the internet, it may take longer for web pages to load, resulting in a poor user experience.
2. **Interrupted video and audio streaming:** Congestion can cause buffering and interruptions in video and audio streaming, making it difficult to watch or listen to content.
3. **Latency:** Latency is the time it takes for a packet of data to travel from one point to another. When there is congestion on the internet, packets may take longer to reach their destination, leading to higher latency.
4. **Packet loss:** When there is congestion on the internet, packets of data may be dropped, leading to incomplete or lost data.

There are a number of ways to manage internet congestion, such as:

1. **Traffic Shaping:** This is a technique that regulates the amount of data that is sent over the network at any given time, helping to prevent congestion. Traffic shaping can be achieved by setting limits on the amount of data that can be sent or received by a device, or by prioritizing certain types of data.
2. **Quality of Service (QoS):** QoS is a set of techniques that prioritize certain types of data, such as real-time audio and video, to ensure that they are delivered with minimal delay and interruption. QoS can be implemented by setting priorities for different types of traffic, such as voice and video, or by using techniques such as packet scheduling.
3. **Load balancing:** Load balancing is a technique that distributes the load across multiple servers, devices or network links to avoid overloading any single point in the network. It helps to ensure that the network is utilized efficiently and that no single device or link is overwhelmed by traffic.
4. **Congestion control:** Congestion control algorithms are used to detect and manage network congestion. These algorithms can be implemented in the network devices or end-points and they can help to reduce the amount of data sent over the network and prevent the network from becoming overwhelmed.

# ISP

An Internet Service Provider (ISP) is a company that provides customers with access to the Internet. ISPs offer a variety of services, such as:

1. **Internet access:** ISPs provide customers with a connection to the Internet, allowing them to access websites, send email, and use online services.
2. **Dial-up:** Dial-up is a type of internet connection that uses a telephone line to connect to the Internet. It is the oldest type of internet service and it is considered slow.
3. **Cable:** Cable is a type of internet connection that uses a cable television line to connect to the Internet. It is faster than DSL and it can support both internet and cable TV services.
4. **Fiber-optic:** Fiber-optic is a type of internet connection that uses light to transmit data through thin glass or plastic fibers. It is the fastest type of internet service and it can support high-speed internet, television, and telephone services.
5. **Satellite:** Satellite is a type of internet service that uses a satellite dish to connect to the Internet. It is typically used in remote or rural areas where other types of internet service are not available.

# IP

IP stands for Internet Protocol, it is a set of rules that govern how data is sent and received over the Internet. The IP is responsible for routing data packets to their destination, regardless of the location of the sender or receiver.

An IP address is a unique numerical label assigned to each device connected to a computer network that uses the Internet Protocol for communication. It serves two main functions: identifying the host or network interface, and providing the location of the host in the network.

There are two main versions of IP in use today:

1. IP version 4 (IPv4): It uses a 32-bit address system and can support up to 4.3 billion addresses. It is the most widely used version of IP.
2. IP version 6 (IPv6): It uses a 128-bit address system and can support up to 3.4 x 10^38 addresses. It is being adopted as a replacement for IPv4 to address the exhaust of IPv4 addresses.