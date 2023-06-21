class Publisher{
       String pubName;
       Publisher(String pubName){
             this.pubName=pubName;
       }
       void display(){
               System.out.println("Publisher\t: "+pubName);
       }
}
class Book extends Publisher{
         String title;
         String author;
         Book(String pubName,String title,String author){
               super(pubName);
               this.title=title;
               this.author=author;
         }
         void display(){
               super.display();
               System.out.println("title\t\t: "+title);
               System.out.println("author\t\t: "+author);
         }
}
class Literature extends Book{
          String type;
          Literature(String pubName,String title,String author,String type){
               super(pubName,title,author);
               this.type=type;
          }
          void display(){
               super.display();
               System.out.println("type\t\t: "+type);
          }
}
class Fiction extends Book{
          String genre;
          Fiction(String pubName,String title,String author,String genre){
               super(pubName,title,author);
               this.genre=genre;
          }
          void display(){
               super.display();
               System.out.println("genre\t\t: "+genre);
          }
}
class Books{
      public static void main(String[]args){
             Literature[]l=new Literature[2];
             Fiction[]f=new Fiction[2];
             l[0]=new Literature("Guy Adams ","The alchemist","Mike Alfreds","Drama");
             l[1]=new Literature("D C Books","Charles Dickens","Virginia Woolf ","Novel");
             f[0]=new Fiction("Chekhov","Strindberg","william shakespere","tragedy");
             f[1]=new Fiction("penguin books","The legends of khasak","o v vijayan","magical realism");
             System.out.println("\tLiterature");
             for(int i=0;i<l.length;i++){
                     System.out.println("#"+(i+1));
                     l[i].display();
             }
             System.out.println("\t Fiction");
             for(int i=0;i<f.length;i++){
                     System.out.println("#"+(i+1));
                     f[i].display();
             }
       }
             
}


