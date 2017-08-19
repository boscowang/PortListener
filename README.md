# PortListener
Port listening tool written in JAVA (with Windows commands)

# Usage
**Server:**
java PortListener 9990

**Client:**
telnet 192.168.1.1 9990

# Multiple Test
**Server:**
start "Port 9990" cmd /k "java PortListener 9990"

**Client:**
start "Testing Port 9990" cmd /k "telnet 192.168.1.1 9990"

