# TD 1
## Remarques préliminaires
* Pour l'ensemble des TDs, vous créerez un compte individuel sur [github](https://github.com/) si vous n'en possédez pas déjà un.
Vous nommerez ce compte de la façon suivante: `uvsq<MonNuméroÉtudiant>`.
Par exemple, pour un étudiant de numéro *21601234*, le compte sera `uvsq21601234`.
* Les commandes `git` sont à taper en ligne de commande dans un *shell*.
* Vous pouvez utiliser l'IDE de votre choix.
Sur le cartable numérique, [Eclipse](www.eclipse.org), [IntelliJ IDEA](http://www.jetbrains.com/idea/) et [Visual Studio Code](https://code.visualstudio.com/) sont installés.
* Vous répondrez aux questions directement dans ce fichier en complétant les emplacements correspondants.
Ajoutez ensuite ce fichier au dépôt `git`.

## Partie I (à faire durant le TD) : découverte de `git`
Dans cet exercice, vous créerez une classe `Fraction` représentant un nombre rationnel et une classe `Main` qui testera les méthodes de la classe `Fraction` **avec des assertions**.
À chaque étape, consultez le statut des fichiers du projet ainsi que l'historique.

1. Sur la forge, créez le dépôt (_repository_) `SimpleFraction`;
En terme de *commits*, quelle différence constatez-vous entre cocher une (ou plusieurs) des cases *Initialize this repository with* et n'en cocher aucune ?
    Ne cocher aucune case ne fait pas de commits alors qu'en cocher une ou plusieurs en fait 1

    *Pour la suite, ne cochez aucune de ces cases*.
1. Localement, configurez `git` avec votre nom (`user.name`) et votre email (`user.email`);
    ```bash
    git config --global user.name "22105068"
    git config --global user.email benjamin.estevan@ens.uvsq.fr
    ```
1. Initialisez le dépôt `git` local pour le projet;
    ```bash
    git init
    ```
1. Créez la classe `Fraction` (vide pour le moment) et la classe `Main` (avec un simple affichage) dans le projet;
Vérifiez que le projet compile et s'exécute dans l'IDE;
Validez les changements;
    ```bash
    git add Fraction.java
    git add Main.java
    git commit -m "Ajout de Fraction.java et Main.java"
    ```
1. Ajoutez un constructeur et la méthode `toString` à la classe `Fraction` et modifiez la classe `Main` en conséquence;
Validez les changements;
    ```Java
        public static void main(String[] args) {
            Fraction f = new Fraction(5, 9);
            System.out.print(f.toString());
        }
    ```
1. Publiez vos modifications sur le dépôt distant;
Vous utiliserez le protocole `https` pour cela;
Vérifiez avec le navigateur;
    ```bash
    git add remote https://github.com/uvsq22105068/SimpleFraction
    git push origin main
    ```
1. Sur la forge, ajoutez un fichier de documentation `README.md`.
Quelle syntaxe est utilisée pour ce fichier ?
    C'est la syntaxe Markdown 
1. Récupérez localement les modifications effectuées sur la forge.
    ```bash
    git pull origin main
    ```
1. Ajoutez les répertoires et fichiers issus de la compilation aux fichiers ignorés par `git` (fichier `.gitignore`);
    ```bash
    /shelf/
    /workspace.xml
    ```
1. Retirez les fichiers de configuration de l'IDE du projet;
    ```bash
    git rm /.idea/misc.xml
    git rm /.idea/modules.xml
    git rm /.idea/runConfigurations.xml
    git rm /.idea/vcs.xml
    ```
    Ajoutez-les aux fichiers ignorés par `git`.
    ```bash
    /shelf/
    /workspace.xml
    /misc.xml
    /modules.xml
    /runConfigurations.xml
    /vcs.xml
    ```
1. Configurez l'accès par clé publique/clé privée à la forge (cf. [Connecting to GitHub with SSH](https://docs.github.com/en/authentication/connecting-to-github-with-ssh)).
    Il faut générer une nouvelle clé SSH, puis ajouter cette nouvelle clé à l'agent SSH, et enfin copier la clé dans la fenêtre prévu à cet effet sur la page de paramètres du profil GitHub.

## Partie II (à faire à la maison) : révisions et perfectionnement *shell* et *IDE*
### Maîtriser le *shell* de commandes
L'objectif de cet exercice est de vous faire réviser/découvrir les commandes de base du *shell* de votre machine.
Vous pouvez répondre en utilisant le shell de votre choix (*bash*, *Powershell*, …).
Pour répondre à ces questions, vous devez effectuer les recherches documentaires adéquates (livre, web, …).

1. Quel OS et quel shell de commande utilisez-vous ?
    Windows est l'OS et Windows Subsystem for Linux(Ubuntu) est le shell de commande
1. Quelle commande permet d'obtenir de l'aide ?
Donnez un exemple.
    ```bash
    help help
    ```
1. Donnez la ou les commandes shell permettant de
    1. afficher les fichiers d'un répertoire triés par taille (taille affichée lisiblement)
        ```bash
        ls -s
        ```
    1. compter le nombre de ligne d'un fichier
        ```bash
        wc -l Main.java
        ```
    1. afficher les lignes du fichier `Main.java` contenant la chaîne `uneVariable`
        ```bash
        grep -w Main.java -e uneVariable
        ```
    1. afficher récursivement les fichiers `.java` contenant la chaîne `uneVariable`
        ```bash
        grep -r uneVariable *.java
        ```
    1. trouver les fichiers (pas les répertoires) nommés `README.md` dans une arborescence de répertoires
        ```bash
        find -type f -name README.md
        ```
    1. afficher les différences entre deux fichiers textes
        ```bash
        diff 1.txt 2.txt
        ```
1. Expliquez en une ou deux phrases le rôle de ces commandes et dans quel contexte elles peuvent être utiles pour un développeur.
    * `ssh`
        > ssh est un programme pour se connecter à une autre machine et pour exécuter des commandes sur cette machine de façon sécurisé.
    * `screen`/`tmux`
        > Ces commandes servent à ouvrir une nouvelle fenêtre avec un shell
    * `curl`/[HTTPie](https://httpie.org/)
        > Ces commandes servent à transférer des données vers ou venant d'un serveurs. On peut s'en servir pour identifier un utilisateur, utiliser des cookies, un proxy...
    * [jq](https://stedolan.github.io/jq/)
        > Cette commande peut être utilisée pour couper, filtrer, tracer et transformer des données de type JSON

### Découverte de votre *IDE*
Dans cet exercice, vous expliquerez en quelques phrases comment vous réalisez les actions ci-dessous dans votre IDE.
Vous pouvez choisir l'IDE/éditeur de texte de votre choix.
Pour réaliser cette exercice, vous devez bien évidemment vous reporter à la documentations de l'IDE ([IntelliJ IDEA](https://www.jetbrains.com/help/idea/discover-intellij-idea.html#developer-tools), [Visual Studio Code](https://code.visualstudio.com/docs), [Eclipse](https://help.eclipse.org/2020-09/index.jsp), …).

1. Quels IDE ou éditeurs de texte utilisez-vous pour le développement Java ?
    IntelliJ

    Pour la suite, ne considérez que l'un de vos choix.
1. Comment vérifier/définir que l'encodage utilisé est *UTF-8* ?
    > Il y a un petit onglet en bas à droite de la page dans lequel on peut décider quel selon quel encodage l'IDE nous corrige
1. Comment choisir le JDK à utiliser dans un projet ?
    > Il faut aller dans Project Stucture, Project Settings, Project, Project SDK et selectionner la version de java que l'on veut utiliser
1. Comment préciser la version Java des sources dans un projet ?
    > 
1. Comment ajouter une bibliothèque externe dans un projet ?
    > Il faut aller dans Project Structure, Platform Settings, Global Libraries et cliquer sur le +
1. Comment reformater un fichier source Java ?
    > Dans Settings, va dans Editor, Code Style et va dans Formatter
1. Comment trouver la déclaration d'une variable ou méthode ?
    > Répondre ici
1. Comment insérer un bloc de code prédéfini (*snippet*) ?
    > Ctrl + Alt + L
1. Comment renommer une classe dans l'ensemble du projet ?
    > Clique droit sur le fichier de la classe, Refactor, Rename et coche les cases
1. Comment exécuter le programme en lui passant un paramètre en ligne de commande ?
    > ALT + SHIFT + F10, Droite, E, Entrée, Tabulation, entrez vos paramètres de ligne de commande, Entrée
1. Comment déboguer le programme en visualisant le contenu d'une ou plusieurs variables ?
    > En mettant des points d'arrêts(clique sur le coté gauche de la ligne) aux endroits où l'on veut vérifier les dîtes variables.
1. Quels paramètres ou fonctionnalités vous semblent particulièrement importants/utiles pour le développement Java ?
    > Je ne sais pas
