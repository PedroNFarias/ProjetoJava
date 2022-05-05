public class calculadoraDeDemanda13 extends calculadoraDeDemanda{
    private static final float demandasA[] = {.86f, .75f, .66f, .59f, .52f, .45f, .40f, .35f, .31f, .27f, .24f};
    private static final float demandasB[] = {1f, 1f, .84f, .76f, .70f, .65f, .60f, .57f, .54f, .52f, .49f, .48f, .46f, .45f, .44f, .43f, .42f, .41f, .40f, .40f, .39f, .39f, .39f, .38f, .38f, .38f};
    private static final float demandasC[] = {1f, .72f, .62f};
    private static final float demandasD[] = {1f, .7f, .7f, .7f, .6f, .6f, .5f, .5f};
    private static final float demandasE[] = {1f, .6f, .48f, .4f, .37f, .35f, .33f, .32f, .31f, .3f, .3f, .28f, .28f, .28f, .28f, .26f};
    private static final float demandasF[] = {1f, .9f, .82f, .8f, .77f, .75f};
    private static final float demandasG[] = {1f, .9f, .8f, .8f, .8f, .7f};
    private static final float demandasH[] = {};
    private static final float demandasI[] = {};
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
        //Soma dos condicionadores de ar
        qtdCondicionadorDeAr = qtd9000BTUs + qtd10000BTUs + qtd12000BTUs + qtd14000BTUs + qtd18000BTUs + qtd21000BTUs + qtd30000BTUs;
        //Se não tiver nenhum equipamento do tipo E a demanda é 0
        if(qtdCondicionadorDeAr > 0){
            //.length retorna o tamanho do vetor e resolve o problema dos números arbitrários
            if(qtdCondicionadorDeAr/10 <= demandasF.length){
                demandaF = cargaF * demandasF[(qtdCondicionadorDeAr - 1)/10];
            }else{
                demandaF = cargaF * demandasF[demandasF.length - 1];
            }
        }else{
            demandaF = 0;
        }
        return demandaF;
    }

    //Demandas de motores e máquinas de solda
    public float demandaG(){
        //Soma dos equipamentos tipo G
        qtdEquipamentosG = qtdMotores + qtdMaquinasDeSolda;
        //Se não tiver nenhum equipamento do tipo E a demanda é 0
        if(qtdEquipamentosG > 0){
            //.length retorna o tamanho do vetor e resolve o problema dos números arbitrários
            if(qtdEquipamentosG <= demandasG.length){
                demandaG = cargaG * demandasG[qtdEquipamentosG - 1];
            }else{
                demandaG = cargaG * demandasG[demandasG.length - 1];
            }
        }else{
            demandaG = 0;
        }
        return demandaG;
    }

    //Demandas de motores e máquinas de solda
    public float demandaH(){
        //Se não tiver nenhum equipamento do tipo E a demanda é 0
        if(qtdMaquinasEspeciais > 0){
            //.length retorna o tamanho do vetor e resolve o problema dos números arbitrários
            if(qtdMaquinasEspeciais <= demandasH.length){
                demandaH = cargaH * demandasH[qtdMaquinasEspeciais - 1];
            }else{
                demandaH = cargaH * demandasH[demandasH.length - 1];
            }
        }else{
            demandaH = 0;
        }
        return demandaH;
    }
}