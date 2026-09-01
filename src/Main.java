enum Role{
    USER(1),MODERATOR(2),ADMIN(3);
    private int level;

    Role(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}

public class Main {
    static void main() {
        System.out.println("these are the available roles : ");
        for(Role r: Role.values()){
            System.out.println(r);
        }

        Role r1 = Role.MODERATOR;
        System.out.println("this is the role "+r1+"  this is the permisssion level of this role : "+r1.getLevel());

        Role r2 = Role.ADMIN;

        switch (r2){
            case USER:
                System.out.println("the role is user: ");
                break;
            case ADMIN:
                System.out.println("the role is Admin  ");
                break;
            case MODERATOR:
                System.out.println("the role is Moderator: ");
                break;
            default:
                System.out.println("please try again..");
        }

        String rolename = "MODERATOR";

        Role r3 = Role.valueOf(rolename);

        System.out.println(r3);
        System.out.println(r3.getLevel());

    }
}