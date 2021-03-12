class UserService{

  public static String getUser(int id){	  
     return "User";
  }
   public static void setUser(User u){
     User u = new User();
     u.setName(u.getId() + "--");
  }
}
