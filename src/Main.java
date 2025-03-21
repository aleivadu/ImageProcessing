public class Main {
    public static void main(String[] args) {

        int[][] imageData = ImageProcessing.imgToTwoD("./apple.jpg");

        int[][] trimmed = ImageProcessing.trimBorders(imageData, 400);
        // CREACION de imagen negativa


        // Guardado de imagen generada
        ImageProcessing.twoDToImage(trimmed,"./trimmed_apple.jpg");
        int[][] negative = ImageProcessing.negativeColor(imageData);

        ImageProcessing.twoDToImage(negative, "./negative_apple.jpg");

        // horizontal
        int [][] stretchedImage = ImageProcessing.stretchHorizontally(imageData);
        ImageProcessing.twoDToImage(stretchedImage, "./strechIMG_apple.jpg");


        // estirar imagen verticalmente
        int [][] shrinkVertically = ImageProcessing.shrinkVertically(imageData);
        ImageProcessing.twoDToImage(shrinkVertically,"./shrinkVertically_apple.jpg");

        int [][] invertImage = ImageProcessing.invertImage(imageData);
        ImageProcessing.twoDToImage(invertImage,"./invertImage_apple.jpg");

        // aplicar color de filtro
        int [][] colorFilter = ImageProcessing.colorFilter(imageData, 50,-20,30);
         ImageProcessing.twoDToImage(colorFilter,"./coloFilter_apple.jpg");

         int[][] canvas = new int[500][500];
        ImageProcessing.paintRandomImage(imageData,  "./canvas_apple.jpg");
    }
}
