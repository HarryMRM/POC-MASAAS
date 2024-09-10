POC-MASAAS: Prueba de concepto para el sistema ficticio MASAAS
-----------------------------------------------------------------------------------------
Este es un programa de simulación del sistema MASAAS realizado en Java, el cual se basa en una arquitectura de SAAS (Software as a Service) con cierta influencia a una arquitectura de capas, el programa describe a muy grosso modo su funcionamiento interno.

Este sistema simula las siguientes funcionalidades:
- Registro de usuarios: Los usuarios pueden registrarse proporcionando un nombre, correo y contraseña. Cada usuario se asocia con una suscripción de nivel Tier (1, 2 o 3).
- Inicio de sesión: Los usuarios registrados pueden iniciar sesión para acceder a sus alertas.
- Gestión de alertas: Los usuarios pueden crear alertas basadas en horarios o eventos específicos, las cuales serán gestionadas dentro del sistema.
- Consultas de alertas: Los usuarios pueden ver y activar sus alertas registradas.
- Integración con servicios de terceros: Los administradores pueden gestionar servicios externos (terceros), habilitando o deshabilitando su sincronización con el sistema.

## Requerimientos
- Java 8 o superior

## Como ejecutar
   ```bash
   git clone https://github.com/
   javac Main.java
   java Main
   ```
## Diagrama de arquitectura y documentación
https://docs.google.com/document/d/1f8-rcJRR7uzQaXg02FgdzN_ugcoNonMraOnwAsJo5Os/edit?usp=sharing
