# Company-Departments-Workers

Analist and Yazilimci classes are created by inheriting from the Calisan class. The Calisan class keeps the name of the employees, how many years they have been working and the amount of their salary. While the Analist class, which is a subclass, uses the same information, the Yazilimci class also keeps the total number of certificates received by the employee in addition to this information.

Calisan sınıfından kalıtımla Analist ve Yazılımcı sınıfları oluşturulmaktadır. Calisan sınıfı, çalışanların ismini, kaç yıldır görev yaptığını ve maaş miktarını tutmaktadır. Alt sınıf olan Analist sınıfı da aynı bilgileri kullanırken, Yazılımcı sınıfı, bu bilgilere ek olarak çalışanın aldığı toplam sertifika sayısı bilgisini de tutmaktadır.

zamYap method is defined as abstract. For this reason, the Calisan class is abstract. The zamYap method should be implemented in the Analist and Yazilimci classes, which are subclasses. Since a raise is made only once a year, the term of office should increase by 1 year with the work of the zamYap method. The raise rate should be 10% for the Analist and 15% for the Yazilimci, the salaries should be updated with the work of the zamYap method.

***
UML diagram of this program:

<img width="223" alt="Untitled" src="https://github.com/gulsoy83/Company-Departments-Workers/assets/46426033/250b39b5-b2f5-4b19-9aaa-8541af8cc6d3">
