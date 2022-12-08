public class Gym {

    public static void main(String[] args) {

        //3 standard members
//        for (int i = 0; i < 3; i++) {
//            StandardMember member = StandardMember.getStandardMember();
//            //scan the member
//            member.scanning();
//            //let them workout
//            member.workingOut("30 minutes");
//            //make them buy products
//            member.buyingProducts(20.0);
//            //print the standard member
//            System.out.println(member);
//            System.out.println("--------------------------------");
//        }

        //3 premium members

//        for (int i = 0; i < 3; i++) {
//            //scan the member
//            //let them workout
//            //make them buy products
//            //get massage
//            //get tanned
//            //print the standard member
//            PremiumMember member = PremiumMember.getPremiumMember();
//            member.scanning();
//            member.workingOut("30 minutes");
//            member.buyingProducts(20.0);
//            member.getMassage("Full body", "Medium");
//            member.getTanned("10 minutes", "Low");
//            System.out.println(member);
//            System.out.println("--------------------------------");
//        }

        //create 5 random members (standard or premium) 2s 3p or 1s 4p NOTE: Use random number (0-1)
        for (int i = 0; i < 5; i++) {
            int random01 = GeneratorUtils.getRandomNumber(0, 1);
            if (random01 == 0) {
                StandardMember standardMember = StandardMember.getStandardMember();
                standardMember.scanning();
                standardMember.workingOut("35 minutes");
                standardMember.buyingProducts(30.5);
                System.out.println(standardMember);
            } else {
                PremiumMember premiumMember = PremiumMember.getPremiumMember();
                premiumMember.scanning();
                premiumMember.workingOut("1 hour 30 minutes");
                premiumMember.buyingProducts(150.2);
                premiumMember.getMassage("Full body", "Medium");
                premiumMember.getTanned("10 minutes", "Low");
                System.out.println(premiumMember);
            }
            System.out.println("---------------------------------------------");
        }

        //(MUST)
        //scan the member

        //let them workout(modify) (OPTIONAL)
        // if the duration is 30 minutes or lower -> "Not a good workout!"
        // if the duration is between 30 minutes and 1 hour -> "Not bad!"
        // if it is 1 hour or more-> "Beast mode!"
        // duration examples: 30 minutes, 25 minutes, 50 minutes, 1 hour 34 minutes

        //(MUST)
        //make them buy products
        //get massage (if it is premium member)
        //get tanned (if it is premium member)
        //print the member
    }
}