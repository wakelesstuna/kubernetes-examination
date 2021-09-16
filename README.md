# Kubernetes Examination

```
Deltagare:
Oscar Steen Forss
```

1. Skapa en hello world tjänst
   Använd https://start.spring.io/ och skapa en tjänst
   Lägg till web som dependency och fyll i all
   information som känns relevant
   Se till att din tjänst har 1 endpoint
   GET /hello som returnerar “Hello, World!”
   
2. Paketera den med docker
   Skapa Dockerfile och bygg din app, bygg din image
   och pusha din image till ditt dockerhub-konto. (Se till
   att det är ett publikt repository!)
   
3. Skapa ett namespace
   Skriv ett manifest som skapar ett namespace där du
   kan deploya din app.
   
4. Skapa en deployment
   Skapa en deployment som spinner up 3 instanser
   av din app.
   
5. Skapa en service
   Skapa en service som ger access till din app enbart
   i kubernetes interna nätverk.
   
6. Pusha koden
   Skriv i README vilka som är med i gruppen och
   pusha koden till Github. Lägg till länken till repot i er
   rapport.
   Du vet att du är klar när du kan köra en port-forward
   på din deployade service, göra ett GET /hello och få
   tillbaka “Hello, World!”
