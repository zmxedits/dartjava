public void fuehreAus()
{
  meinStift.bewegeBis(700, 100);
  meinStift.zeichneKreis(10);
  meinStift.zeichneKreis(20);
  meinStift.zeichneKreis(30);
  meinStift.zeichneKreis(40);
  
  int x = 300;
  int c = 350;
  int y = 230;
  int v = 200; 
  int b = 0;
 
  
  while(x < 700){
     meinStift.normal();
     meinStift.hoch();
     meinStift.bewegeBis(x, y);
     meinStift.runter();
     meinStift.bewegeBis(c, v);
  }
  
  try{
    Thread.sleep(20);
  } catch(InterruptedException ex) {
    Thread.currentThread().interrupt();
  }

  meinStift.radiere();
  meinStift.bewegeBis(x, y);
  meinStift.runter();
  meinStift.bewegeBis(c, v);
  meinStift.zeichneKreis(2);
  
  y++;
  v++;
  
  if(y == 600){
    y = 0;
  }
  
  if(v == 600){
    v = 0;
  }
  
  if(dieMaus.istGedrueckt){
    meinStift.dreheUm(360);
  }
}
