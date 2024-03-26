Manual de Utilizare pentru Aplicația de Monitorizare a Fișierelor
Introducere
Aplicația de monitorizare a fișierelor este un instrument util pentru a urmări și gestiona modificările dintr-un director specificat. Acest manual vă va ghida pas cu pas în utilizarea și înțelegerea funcționalităților acestei aplicații.
Instalare și Configurare
Asigurați-vă că aveți instalată versiunea necesară a .NET Framework pe computerul dvs.
Descărcați sau copiați codul aplicației într-un fișier sursă C# (de exemplu, Program.cs).
Deschideți un mediu de dezvoltare C# (de exemplu, Visual Studio) sau un editor de text și încărcați fișierul sursă.
Modificați variabilele monitoredFolder, logFilePath și commitFolder pentru a specifica căile către directorul monitorizat, fișierul de jurnal și folderul de commituri, respectiv.
Utilizare
După configurarea aplicației, urmați acești pași pentru a utiliza funcționalitățile oferite:
1. Lansarea Aplicației
Rulați aplicația compilată sau compilați manual codul sursă și rulați aplicația rezultată.


2. Introducerea Comenzilor
La rularea aplicației, veți fi întâmpinați cu un prompt de comandă. Introduceți comenzile după cum urmează:
commit: Realizează un commit al stării curente a fișierelor monitorizate. Snapshot-ul va fi salvat într-un fișier de commit cu numele format din indice, data și ora.
info <nume_fisier>: Afișează informații detaliate despre fișierul specificat.
commit status: Afișează toate fișierele de commit disponibile în folderul de commituri.
commit restaur: Restaurează un snapshot din folderul de commituri, specificând numele fișierului introducand numele fisierului.
status: Afișează conținutul fișierului de jurnal.

3. Observarea și Monitorizarea
Aplicația monitorizează în mod automat modificările din directorul specificat și afișează notificări în funcție de acțiunile realizate.

Concluzie
Aplicația de monitorizare a fișierelor vă oferă un instrument eficient pentru a urmări și gestiona modificările dintr-un director specificat. Utilizând acest manual, veți putea utiliza cu succes toate funcționalitățile oferite de aplicație.
Pentru orice întrebări suplimentare sau probleme, vă rugăm să consultați documentația sau să contactați dezvoltatorul „victorsima47@gmail.com”
