package com.btvn.bai2;

import java.util.ArrayList;

public class ArrayLists extends ArrayList {
    ArrayList<Index> arrayLists = new ArrayList<>();
    String str = "35+-+4-5--6+4---+34-+-+56";

    int index1 = str.indexOf("-+");
    int index2 = str.indexOf("+-");
    int index3 = str.indexOf("--");
    int index4 = str.indexOf("++");

    public void addIndex(){
        Index indexa = new Index("index1",index1);
        arrayLists.add(indexa);
        Index indexb = new Index("index2",index2);
        arrayLists.add(1, indexb);
        Index indexc = new Index("index3",index3);
        arrayLists.add(2, indexc);
        Index indexd = new Index("index4",index4);
        arrayLists.add(3, indexd);

        for (int i = 0; i < arrayLists.size()-1; i++) {
            for (int j = i+1; j < arrayLists.size(); j++) {
                if(arrayLists.get(i).getgTri() > arrayLists.get(j).getgTri()){
                    Index index = new Index(arrayLists.get(i).getTen(),arrayLists.get(i).getgTri() );
                    arrayLists.set(i, arrayLists.get(j));
                    arrayLists.set(j, index);
                }
            }
        }
    }
    public void ssArrayLists(){
        for (int i = 0; i < arrayLists.size()-1; i++) {
            for (int j = i+1; j < arrayLists.size(); j++) {
                if(arrayLists.get(i).getgTri() > arrayLists.get(j).getgTri()){
                    Index index = new Index(arrayLists.get(i).getTen(),arrayLists.get(i).getgTri() );
                    arrayLists.set(i, arrayLists.get(j));
                    arrayLists.set(j, index);
                }
            }
        }
    }
    public void print(){
        for (Index db : arrayLists){
            System.out.print(db.getTen() );
            System.out.println(" Có giá trị là: " + db.getgTri() );
            System.out.println("========================");
        }
    }
    public void chuanHoa(){
        for (int i = 0; i < arrayLists.size() ; i++) {
            if (arrayLists.get(i).getgTri()>= 0){
                str = str.replace("-+", "-");
                str = str.replace("+-", "-");
                str = str.replace("--", "-0-");
                str = str.replace("++", "+0+");

                Index indexa = new Index("index1",index1);
                arrayLists.set(0, indexa);
                Index indexb = new Index("index2",index2);
                arrayLists.set(1, indexb);
                Index indexc = new Index("index3",index3);
                arrayLists.set(2, indexc);
                Index indexd = new Index("index4",index4);
                arrayLists.set(3, indexd);
            }
        }
        System.out.println(str);
    }

    public void tinh() {
        int tong = 0;
        String[] arr = str.split("\\+");
        for (int i = 0; i < arr.length; i++) {
            String[] arr1 = arr[i].split("-");
            for (int j = 0; j < arr1.length; j++) {
                if (j == 0) {
                    tong += Integer.parseInt(arr1[j]);
                }else {
                    tong -= Integer.parseInt(arr1[j]);
                }
            }
        }
        System.out.println("Tong la: "+ tong);
    }
}
