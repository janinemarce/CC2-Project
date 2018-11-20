// MARCELINO, Fillian Janine G.
// CITCS-1E
// Create a nested if-else about University of the Cordilleras College
package college;
import java.util.Scanner;
public class College {
    
    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
       System.out.println("Welcome to the University of the Cordilleras!");
       System.out.println("What is your College Department?");
       String dep = sc.nextLine();
        
       if (dep.equals("CAS") || dep.equals("cas")){
           System.out.println("Welcome to the College of Arts and Sciences!");
           System.out.println("The basic mission of the College is to increase knowledge of students in the humanities, social sciences and natural sciences and in their understanding of the world and themselves and to sharpen their skills and instill self-discipline so that they may lead a richer, more rewarding life and become productive members of the Philippine society and the world at large.");
           System.out.println("What is your Academic Program?");
           String prog = sc.nextLine();
            if (prog.equals("English")){
                System.out.println("Your program is Bachelor of Arts in English!");
                System.out.println("The subjects offered in the course hone the four macro-communication skills, thus, developing the abilities of students to speak and write with clarity, and to listen and read with comprehension.");
                System.out.println("At the same time, these subjects develop the skills in critical and creative thinking, literary analyses, intrapersonal and public communications.");
            } else if (prog.equals("Political Science")) {
                System.out.println("Your program is Bachelor of Arts in Political Science!");
                System.out.println("It is designed to equip students with basic knowledge to become researchers and/or employees in government and non-government offices as well as in public and private political agencies.");
            } else if (prog.equals("Communication")) {
                System.out.println("Your program is Bachelor of Arts in Communication!");
                System.out.println("It  is designed for students who are interested to be trained in print media and electronic media - inspire young men and women to seek socially useful and rewarding careers in a field whose importance is second to none.");
            } else if (prog.equals("Psychology")) {
                System.out.println("Your program is Bachelor of Arts in Psychology!");
                System.out.println("The program examines the science behind individual and collective behavior. It features both active and collaborative experiences in addition to intensive internship experiences, and is most appropriate for students who wish to develop a set of applied scientific and human relations skills that will prepare them for entry-level employment in a wide range of government and private human service organizations and agencies, and in business and industry.");
            } else {
                System.out.println("Sorry that academic program is invalid");
            }
       } else if (dep.equals("CBA") || dep.equals("cba")) {
           System.out.println("Welcome to the College of Business Administration!");
           System.out.println("We aim to develop and enhance world-class graduates in the field of business administration imbued with social responsibilities and humane values");
           System.out.println("What is your Academic Program?");
           String prog = sc.nextLine();
            if (prog.equals("Business Administration")) {
                System.out.println("Your program is Bachelor of Science in Business Administration");
                System.out.println("Graduates posses necessary professional knowledge and relevant employability skills, such as communication, teamwork, problem-solving, initiative and enterprise, planning and organizing, self-management, learning and technology, for self or corporate employment, making them locally and globally competitive.");
                System.out.println("What is your Major?");
                String major = sc.nextLine();
                    if (major.equals("Business Management")) {
                        System.out.println("You Major in Business Management!");
                    } else if (major.equals("Financial Management")) {
                        System.out.println("You Major in Financial Management!");
                    } else if (major.equals("Business Economics and Research")) {
                        System.out.println("You Major in Business Economics and Research!");
                    } else if (major.equals("Marketing Management")){
                        System.out.println("You Major in Marketing Management!");
                    } else{
                        System.out.println("Sorry the major you entered is invalid");
                    }
            } else if (prog.equals("Entreprenuerhship")){
                System.out.println("Your program is Bachelor of Science in Business Administration");
                System.out.println("Where graduates posses necessary professional knowledge and relevant employability skills, such as communication, teamwork, problem-solving, initiative and enterprise, planning and organizing, self-management, learning and technology, for self or corporate employment, making them locally and globally competitive.");
            } else if (prog.equals("Office Administration")) {
                System.out.println("Your program is Bachelor of Office Administration");
                System.out.println("The requirements for an office administration career specifically in various and general and specialized administrative support, supervisory and managerial positions.");
            } else {
                System.out.println("Sorry the program you entered is invalid");
            }
      } else if (dep.equals("CEA") || dep.equals("cea")){
          System.out.println("Welcome to the College of Engineering and Architecture!");
          System.out.println("The college aims to contribute a valuable share in the country's physical development, in the modernization of its infrastructures, and in improving the material comforts of man. Its contribution to nation building assumes visible form and directly affects regional landscapes.");
      } else if (dep.equals("CITCS") || dep.equals("citcs")){
          System.out.println("Welcome to the College of Information Technology and Computer Science!");
          System.out.println("In 1986, the University of the Cordilleras, then known as the Baguio Colleges Foundation, became the first institution in Baguio City to offer a four-year course in Computer Science. Under the umbrella of the Arts and Sciences, this new division started with barely 100 students, 4 faculty members, and one course offering: Bachelor of Science in Information and Computer Science.");
          System.out.println("What is your Academic Program?");
          String prog = sc.nextLine();
            if (prog.equals("Computer Science") || dep.equals("BSCS")){
                System.out.println("Your program is Bachelor of Science in Computer Science!");
                System.out.println("The Bachelor of Science in Computer Science program provides the students with an in-depth understanding on the theoretical and applied aspects of computing. Students gain knowledge of the theories along with the methodologies and techniques in the research and development of multifaceted software systems as well as new knowledge in the field of computing.");
                System.out.println("What is your Major?");
                String major = sc.nextLine();
                    if (major.equals("Digital Arts and Animation")|| dep.equals("digital arts and animation")) {
                        System.out.println("You Major in Digital Arts and Animation!");
                        System.out.println("This emphasizes on the development of foundational skills that remain relevant and useful regardless of the technology or medium. Students who successfully complete this program will have the skills to produce powerful, affecting imagery in a professional studio environment.");
                    } else if (major.equals("Mobile Technology")|| dep.equals("mobile technology")) {
                        System.out.println("You Major in Mobile Technology!");
                        System.out.println("This course will focus on advances in Mobile technology, and is designed to develop students' understanding of the frontier of research in mobile computing.");
                    } else {
                        System.out.println("Sorry the major you entered is invalid");
                    }
            } else if (prog.equals("Information Science") || dep.equals("BSIS")) {
                System.out.println("Your program is Bachelor of Science in Information Science!");
                System.out.println("The curriculum Bachelor of Science in Information Systems (BSIS) program is designed to respond to the needs of the students for critical skills and knowledge required to direct and to control computerized information resources within diverse organizational settings.");
                System.out.println("What is your Major?");
                String major = sc.nextLine();
                    if (major.equals("e-Learning Technology")) {
                        System.out.println("You Major in e-Learning Technology!");
                    } else if (major.equals("Business Process Management")) {
                        System.out.println("You Major in Business Process Management!");
                    } else {
                        System.out.println("Sorry the major you entered is invalid");
                    }
            } else if (prog.equals("Information Technology") || dep.equals("BSIT")) {
                System.out.println("Your program is Information Technology!");
                System.out.println("The program focuses on the roles of IT professionals ranging from installing applications to designing computer networks and databases to meet the needs of the industry and government. ");
                System.out.println("The development, management, and maintenance of IT systems are key competitive factors that are essential to business success in today's world.");
                System.out.println("What is your Major?");
                String major = sc.nextLine();
                    if (major.equals("Enterprise Resource Planning") || dep.equals("enterprise resource planning")) {
                        System.out.println("You Major in Enterprise Resource Planning!");
                        System.out.println("Enterprise resource planning (ERP) is business process management software that allows an organization to use a system of integrated applications to manage the business and automate many back office functions related to technology, services and human resources.");
                    } else if (major.equals("Network and Security")|| dep.equals("network and security")) {
                        System.out.println("You Major in Network and Security!");
                        System.out.println("The Network Security Track prepares students to be information security professionals who can manage the security of increasingly critical electronic information and data communication systems. This track teaches students how to develop, build and maintain secure and cost-effective computer systems as part of a comprehensive and efficient cyber security effort within private or public sector entities.");
                    } else if (major.equals("Web Design") || dep.equals("web design")) {
                        System.out.println("You Major in Web Design!");
                        System.out.println("Bachelor's degree programs in Web design teach the skills needed to create websites. These programs often pair the major with studies in technology or design, such as graphic design, multimedia, Web production or digital media.");
                    }else {
                        System.out.println("Sorry the major you entered is invalid");
                    }
            } else if (prog.equals("Associate in Computer Technology")) {
                System.out.println("Your program is Associate in Computer Technology!");
                System.out.println("We provide the students with the skills and understanding to manage, improve and take care of computer systems and computer applications. Students will be prepared to work with advanced computer and communications equipments, computer applications and as support for offices and IT organizations.");
            } else {
                System.out.println("Sorry the program you entered is invalid");
            }   
      } else if (dep.equals("CTE") || dep.equals("cte")){
          System.out.println("Welcome to the College of Teacher Education");
          System.out.println("The College of Teacher Education firmly believes that teachers constitute the most important resource in the nation's teaching-learning force. As such, they should be imbued with the ideals, aspirations and traditions of Philippine life and culture and should be equipped not only with the necessary pedagogical skills but also with adequate and updated knowledge in their field in line with the institution's goal of providing relevant education.");
      } else if (dep.equals("COA")|| dep.equals("coa")){
          System.out.println("Welcome to the College of Accountancy");
          System.out.println("The College of Accountancy provides an educational program through which students can prepare themselves for accounting, accounting related endeavors, and increasing levels of responsibility in business and society. Graduates should acquire a broad liberal education, effective personal skills, a life-long quest for knowledge, and a global perspective that will enable them to contribute to their profession and to the world.");
      } else {
          System.out.println("Sorry the College Department you entered is invalid :(");
      }
    }
}
