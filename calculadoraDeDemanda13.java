public class calculadoraDeDemanda13 extends calculadoraDeDemanda{
    private static final float demandasA[] = {0.86f, 0.75f, 0.66f, 0.59f, 0.52f, 0.45f, 0.40f, 0.35f, 0.31f, 0.27f, 0.24f};
    private static final float demandasB[] = {1f, 1f, .84f, .76f, .70f, .65f, .60f, .57f, .54f, .52f, .49f, .48f, .46f, .45f, .44f, .43f, .42f, .41f, .40f, .40f, .39f, .39f, .39f, .38f, .38f, .38f};
    private static final float demandasC[] = {1f, .72f, .62f};
    
    //retorna a demanda total de tomadas e lâmpadas
    public float demandaA(){
        if(cargaA <= 1000f){
            demandaA = cargaA * demandasA[((int)Math.ceil(cargaA/1000f))-1];
        }else if(cargaA <= 2000f){
            demandaA = cargaA * demandasA[((int)Math.ceil(cargaA/1000f))-1];
        }else if(cargaA <= 3000f){
            demandaA = cargaA * demandasA[((int)Math.ceil(cargaA/1000f))-1];
        }else if(cargaA <= 4000f){
            demandaA = cargaA * demandasA[((int)Math.ceil(cargaA/1000f))-1];
        }else if(cargaA <= 5000f){
            demandaA = cargaA * demandasA[((int)Math.ceil(cargaA/1000f))-1];
        }else if(cargaA <= 6000f){
            demandaA = cargaA * demandasA[((int)Math.ceil(cargaA/1000f))-1];
        }else if(cargaA <= 7000f){
            demandaA = cargaA * demandasA[((int)Math.ceil(cargaA/1000f))-1];
        }else if(cargaA <= 8000f){
            demandaA = cargaA * demandasA[((int)Math.ceil(cargaA/1000f))-1];
        }else if(cargaA <= 9000f){
            demandaA = cargaA * demandasA[((int)Math.ceil(cargaA/1000f))-1];
        }else if(cargaA <= 10000f){
            demandaA = cargaA * demandasA[((int)Math.ceil(cargaA/1000f))-1];
        }else if(cargaA > 10000f){
            demandaA = cargaA * demandasA[10];
        }
        return demandaA;
    }

    public float demandaB(){
        qtdEquipamentosB = qtdChuveiro + qtdTorneira + qtdFerroEletrico + qtdAquecedorDeAguaPassagem;
        if(qtdEquipamentosB < 0){
            demandaB = cargaB * demandasB[qtdEquipamentosB - 1];
        }else{
            demandaB = 0;
        }
        return demandaB;
    }

    public float demandaC(){
        if(qtdAquecedorCentralAcumulacao > 0){
            if(qtdAquecedorCentralAcumulacao < 3){
                demandaC = cargaC * demandasC[qtdAquecedorCentralAcumulacao - 1];
            }else{
                demandaC = cargaC * demandasC[2];
            }
        }else{
            demandaC = 0;
        }
        return demandaC;
    }

}