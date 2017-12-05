package edu.cse;

class PascalLike {
    private int[][] layerList;
    private int casing;

    PascalLike(int numLayers, int startNum) {
        layerList = new int[numLayers][];
        casing = startNum;
        for(int i = 0; i < layerList.length; i++) layerList[i] = new int[i+1];

        if(numLayers >= 1) layerList[0][0] = casing;
        if(numLayers >= 2) {
            layerList[1][0] = casing;
            layerList[1][1] = casing;
        }
    }

    void make() {
        for(int i = 2; i < layerList.length; i++) {
            for(int j = 0; j < layerList[i].length; j++) {
                if(j == 0 || j == layerList[i].length-1) layerList[i][j] = casing;
                else layerList[i][j] = (layerList[i-1][j-1]) + (layerList[i-1][j]);
            }
        }

//        int indent;
//        indent = (layerList[layerList.length-1].length)-1;

        for(int[] layer : layerList) {
            for(int item : layer) System.out.print(item + " ");
            System.out.println();
        }

    }
}
