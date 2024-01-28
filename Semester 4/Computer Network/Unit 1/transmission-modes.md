# Transmission Modes
The way in which data is transmitted from one device to another is known as the transmission mode, also referred to as the communication mode. Each communication channel has an associated direction, defined in the physical layer, and is categorized into three types:
![](https://static.javatpoint.com/tutorial/computer-network/images/transmission-modes-three-categories.png)

## 1. Simplex Mode:
In Simplex mode, communication is unidirectional, meaning data flows in one direction. A device can either send or receive data but not both simultaneously. Examples include radio stations, keyboards, and monitors.
![](https://static.javatpoint.com/tutorial/computer-network/images/transmission-modes-simplex-mode.png)

### Advantage of Simplex mode:
- Utilizes the entire bandwidth of the communication channel during transmission.

### Disadvantage of Simplex mode:
- Unidirectional communication with no inter-communication between devices.

## 2. Half-Duplex Mode:

In Half-duplex mode, communication can be bidirectional, but not simultaneously. Messages flow in both directions, but the entire bandwidth is utilized in one direction at a time. Walkie-talkies are an example of Half-duplex mode.
![](https://static.javatpoint.com/tutorial/computer-network/images/transmission-modes-half-duplex-mode.png)

### Advantage of Half-duplex mode:
- Both devices can send and receive data, utilizing the entire bandwidth during data transmission.

### Disadvantage of Half-Duplex mode:
- One device has to wait while the other is sending data, causing delays.

## 3. Full-Duplex Mode:

In Full-duplex mode, communication is bidirectional, allowing data to flow in both directions simultaneously. This mode consists of two simplex channels, providing fast communication. Telephone networks are a common example of Full-duplex mode.
![](https://static.javatpoint.com/tutorial/computer-network/images/transmission-modes-full-duplex-mode.png)

### Advantage of Full-duplex mode:
- Both stations can send and receive data simultaneously.

### Disadvantage of Full-duplex mode:
- If there is no dedicated path between devices, the capacity of the communication channel is divided into two parts.

# Difference between Simple, Half, Full Duplex Mode
| Feature          | Simplex Mode                  | Half-Duplex Mode                    | Full-Duplex Mode                    |
|------------------|-------------------------------|-------------------------------------|-------------------------------------|
| Data Flow        | Unidirectional                | Bidirectional (one direction at a time) | Bidirectional (simultaneous)        |
| Devices          | One-way communication         | Two-way communication               | Two-way communication               |
| Utilization      | Utilizes the entire bandwidth during transmission | Utilizes the entire bandwidth, but in one direction at a time | Simultaneous use of bandwidth in both directions |
| Examples         | Radio stations, Keyboard, Monitor | Walkie-talkies                     | Telephone networks                  |
| Advantages       | Simple and efficient for one-way communication | Allows bidirectional communication, better than simplex | Simultaneous two-way communication   |
| Disadvantages    | Limited to one-way communication | Delays during switching between sending and receiving | Requires dedicated path for optimal performance, potentially dividing bandwidth |
