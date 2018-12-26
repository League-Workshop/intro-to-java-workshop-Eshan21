PImage beard;
  PImage smiley_face;
void setup() {
  smiley_face = loadImage("smiley_face.png");
    size(800, 1000);
    smiley_face.resize(800, 1000);
  beard = loadImage("beard.png");
    beard.resize(800, 900);
    
}
void draw() {
  background(0,0,0);
  //background(smiley_face);
  image(beard, mouseX-375, mouseY-350);
  
}