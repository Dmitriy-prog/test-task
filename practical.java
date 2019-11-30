public class practical {

    public static void main(String[] args) {

        String[] arr1 = {"test","service2","dev","service4","test5","test6","test7","service8","prod"};
        String[] arr2 = {"test6","service2","service4","service8"};
        StringBuffer str = new StringBuffer();
    
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {

                if (arr1[i].equals(arr2[j])) {
                    str.append("1");
                } else {
                    str.append("0");
                } 
            }
        }
        System.out.println(str);
    }
}

    
    