#📚 Complexidade de Algoritmos – Explicação Simples + Exemplos em Java

Este repositório contém o código e os exemplos usados no vídeo “Complexidade de Algoritmos Explicada Como se Fosse para Criança”, onde explico de forma simples o que significa O(1), O(log n), O(n) e O(n²).

O objetivo é ajudar iniciantes a entender como o tempo de execução de um programa muda conforme o tamanho da entrada aumenta.

🎥 Conteúdo do Vídeo

No vídeo você aprende:

✅ O que é complexidade de algoritmos
✅ Por que alguns programas são rápidos e outros são lentos
✅ O significado de:

O(1) – Tempo constante (super rápido)

O(log n) – Tempo logarítmico (divide o problema pela metade)

O(n) – Tempo linear (percorrer tudo)

O(n²) – Tempo quadrático (loops dentro de loops)

✅ Exemplos práticos em Java
✅ Aplicações no mundo real (Google Maps, Netflix, TikTok, Jogos)

🧩 Estrutura dos Exemplos

Os exemplos em Java estão organizados assim:

📁 complexidade-algoritmos/
 ├── O1_Exemplo.java
 ├── OlogN_Exemplo.java
 ├── ON_Exemplo.java
 └── ON2_Exemplo.java

⚙️ Como Executar os Códigos
1️⃣ Pré-requisitos

Você precisa ter:

Java JDK 8 ou superior instalado

Terminal / Prompt de Comando

(Opcional) VS Code ou IntelliJ IDEA

Para verificar se o Java está instalado, use:

java -version


Se aparecer a versão, está tudo certo ✅

2️⃣ Compilar e executar um arquivo

Exemplo com O1_Exemplo.java:

javac O1_Exemplo.java
java O1_Exemplo


Faça o mesmo para os outros arquivos:

javac ON_Exemplo.java
java ON_Exemplo

💻 Exemplos de Código
🔹 Exemplo O(1) – Tempo constante
public class O1_Exemplo {
    public static void main(String[] args) {
        int numero = 10;
        System.out.println("Número: " + numero);
    }
}

🔹 Exemplo O(n) – Tempo linear
public class ON_Exemplo {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};

        for (int n : numeros) {
            System.out.println(n);
        }
    }
}

🔹 Exemplo O(n²) – Dois loops
public class ON2_Exemplo {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.println(i + " x " + j);
            }
        }
    }
}

🎯 Objetivo do Projeto

Este projeto foi criado para:

Ajudar iniciantes a entenderem algoritmos

Mostrar que código pode ser simples e didático

Conectar teoria com prática

📢 Onde assistir

O vídeo está disponível em:

YouTube

Instagram Reels

TikTok

(Coloque aqui o link do seu vídeo depois de publicar)
