class Main {
  public static void main(String[] args) {
    Hotel whiteHouse = new Hotel("White House", 2);
    whiteHouse.requestRoom("Bush");
    whiteHouse.requestRoom("Obama");
    whiteHouse.requestRoom("Trump");
    whiteHouse.requestRoom("Biden");

    whiteHouse.printCurrentReservations();
    System.out.println();
    whiteHouse.printCurrentWaitlist();
    whiteHouse.cancelAndReassign(whiteHouse.getRooms()[1]);
    System.out.println();
    whiteHouse.printCurrentReservations();
    System.out.println();
    whiteHouse.printCurrentWaitlist();

  }
}