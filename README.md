
---

**Autores:**

- Héctor Jose Guzmán Montaño
- Juan David Abril Castillo
- Bryam Steven Diaz Garcia

---

### Primer Punto

Para el primer punto, se utilizó el patrón de diseño creacional **Prototype**, ya que era necesario crear un objeto a partir de otro objeto existente. Además, el programa requería la creación de múltiples héroes, por lo que se crearon subclases para este propósito.

![primer_punto.png](src%2Fprimer_punto.png)

---

### Segundo Punto

En el segundo caso, fue necesario utilizar un patrón de diseño **Observer**, como se muestra en el siguiente diagrama UML. El problema que enfrentábamos era la necesidad de un patrón de comportamiento, ya que al momento de notificar, debía hacerse simultáneamente a todos los dispositivos del cliente. Por lo tanto, se implementó esta solución utilizando el patrón **Observer**.

![ejercicio2.png](src%2Fejercicio2.png)

---

### Tercer punto

Para el tercer caso utilizamos **Template Method**, este ejercicio nos pedia una estructura comun para el procesamiento de ordenes e implementar pasos especificos para cada subclase, este patron nos permite definir un esqueleto en la superclase y que las subclases sobreescriban pasos de la superclase sin modificar su estructura.

**Solucion: Template Method**

![image](https://github.com/user-attachments/assets/ab8850b9-0924-404b-a34f-5eabba22876d)

---

### Cuarto punto

En el ejercicio 4, el reto era crear un sistema de gestion, CRUD y registro de tareas. Se uso **Command** el cual permite volver solicitudes en objetos independientes, permitiendo realizar diferentes operaciones.

**Solucion: Command**

![Ejercicio4 drawio](https://github.com/user-attachments/assets/4ca8e552-902e-4438-95f4-c59daf8caa3c)

---

### Quinto punto

Para el quinto caso utulizamos el patron estructural **Decorator**, el problema que teniamos era tener adiciones a las habitaciones de un hotel de manera dinamica, flexible y ademas que el codigo sea legible. Este patron estructural nos ayudo a crear un decorador que nos permite componer el objeto con diferentes combinaciones.

**Solucion: Decorator**

![image](https://github.com/user-attachments/assets/a4ef1c74-7ff7-49b4-9496-28f4083daa1f)

