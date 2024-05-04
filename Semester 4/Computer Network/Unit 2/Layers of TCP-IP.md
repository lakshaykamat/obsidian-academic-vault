# Layers of TCP/IP
The TCP/IP model can be visualized as a layered structure, typically consisting of **four layers**:

## 1. Application Layer:
This layer is closest to the user and ==interacts directly with applications== like web browsers, email clients, and video players. It defines protocols like HTTP (web browsing), FTP (file transfer), and SMTP (email).
> Protocols: HTTP FTP SMTP
## 2. Transport Layer:
This layer handles ==reliable data delivery between applications on different devices.== It uses protocols like TCP (guarantees order and error-free delivery) and UDP (faster, but doesn't guarantee order or error-free delivery).
> Protocols: TCP and UDP
## 3. Network Layer:
This layer is ==responsible for routing data packets across the network.== It uses the Internet Protocol (IP) to address and route packets to their destination based on IP addresses.
> Protocols: IP
## 4. Network Access Layer:
This layer, sometimes combined with the Physical Layer in a five-layer model, ==deals with the physical transmission of data over the network medium (e.g., cables, Wi-Fi).== It includes protocols like Ethernet and Wi-Fi standards.
> Protocols: Ethernet and Wi-fi


- **Application Layer:** You write the message on the paper.
- **Transport Layer:** You put the message in an envelope and seal it. This ensures the message stays intact.
- **Network Layer:** You write your friend's address on the envelope. This allows the postal service to know where to deliver it.
- **Network Access Layer:** You take the envelope to the mailbox. This layer deals with the physical act of sending the letter.