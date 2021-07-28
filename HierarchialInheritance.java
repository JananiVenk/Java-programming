class Main
{
    public  static void main(String[] args)
     {
        System.out.println("\nMission World:\n");
        World w=new World();
        w.display();
        System.out.println("\nMission Mars:\n");
        Mars m=new Mars();
        m.put();
      }
}
class universe
{
    void print()
    {
        System.out.println("Hello Universe");
    }
}
class World extends universe
{
    void display()
    {
        print();
        System.out.println("Hello World");
    }
}
class Mars extends universe
{
    void put()
    {
        print();
        System.out.println("Hello Mars");
    }
}



