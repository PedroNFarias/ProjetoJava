public class calculadoraDeDemanda13 extends calculadoraDeDemanda{
    private static final float demandasA[] = {0.86f, 0.75f, 0.66f, 0.59f, 0.52f, 0.45f, 0.40f, 0.35f, 0.31f, 0.27f, 0.24f};
    private static final float demandasB[] = {1f, 1f, .84f, .76f, .70f, .65f, .60f, .57f, .54f, .52f, .49f, .48f, .46f, .45f, .44f, .43f, .42f, .41f, .40f, .40f, .39f, .39f, .39f, .38f, .38f, .38f};
    private static final float demandasC[] = {1f, .72f, .62f};
    private static final float demandasD[] = {1f, .7f, .7f, .7f, .6f, .6f, .5f, .5f};
    private static final float demandasE[] = {1f, .6f, .48f, .4f, .37f, .35f, .33f, .32f, .31f, .3f, .3f, .28f, .28f, .28f, .28f, .26f};
    
    //retorna a demanda total de tomadas e lâmpadas
    public float demandaA(){
        /*((int)Math.ceil(cargaA/1000f))-1
        Equação que retorna o próximo número abaixo*/
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
            //.length retorna o tamanho do vetor e resolve o problema dos números arbitrários
            demandaA = cargaA * demandasA[demandasA.length - 1];
        }
        return demandaA;
    }

    public float demandaB(){
        //Soma dos equipamentos do tipo B
        qtdEquipamentosB = qtdChuveiro + qtdTorneira + qtdFerroEletrico + qtdAquecedorDeAguaPassagem;
        //Se não tiver nenhum equipamento do tipo B a demanda é 0
        if(qtdEquipamentosB > 0){
            //.length retorna o tamanho do vetor e resolve o problema dos números arbitrários
            if(qtdEquipamentosB <= demandasB.length){
                demandaB = cargaB * demandasB[qtdEquipamentosB - 1];
            }else{
                demandaB = cargaB * demandasB[demandasB.length - 1];
            }
        }else{
            demandaB = 0;
        }
        return demandaB;
    }

    public float demandaC(){
        //Se não tiver nenhum equipamento do tipo C a demanda é 0
        if(qtdAquecedorCentralAcumulacao > 0){
            //.length retorna o tamanho do vetor e resolve o problema dos números arbitrários
            if(qtdAquecedorCentralAcumulacao <= demandasC.length){
                demandaC = cargaC * demandasC[qtdAquecedorCentralAcumulacao - 1];
            }else{
                demandaC = cargaC * demandasC[demandasC.length - 1];
            }
        }else{
            demandaC = 0;
        }
        return demandaC;
    }

    public float demandaD(){
        //Soma dos equipamentos do tipo D
        qtdEquipamentosD = qtdSecadora + qtdFornoEletrico + qtdMaquinasDeLavarLouca + qtdMicroondas;
        //Se não tiver nenhum equipamento do tipo D a demanda é 0
        if(qtdEquipamentosD > 0){
            //.length retorna o tamanho do vetor e resolve o problema dos números arbitrários
            if(qtdEquipamentosD <= demandasD.length){
                demandaD = cargaD * demandasD[qtdEquipamentosD - 1];
            }else{
                demandaD = cargaD * demandasD[demandasD.length - 1];
            }
        }else{
            demandaD = 0;
        }
        return demandaD;
    }

    public float demandaE(){
        //Se não tiver nenhum equipamento do tipo E a demanda é 0
        if(qtdFogoesEletricos > 0){
            //.length retorna o tamanho do vetor e resolve o problema dos números arbitrários
            if(qtdFogoesEletricos <= demandasE.length){
                demandaE = cargaE * demandasE[qtdFogoesEletricos - 1];
            }else{
                demandaE = cargaE * demandasE[demandasE.length - 1];
            }
        }else{
            demandaE = 0;
        }
        return demandaE;
    }

    public float demandaF(){
        
        return demandaF;
    }
}