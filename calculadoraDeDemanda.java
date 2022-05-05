public class calculadoraDeDemanda{
    protected float cargaA; //Carga tomadas e lâmpadas
    protected float demandaA; //Demanda tomadas e lâmpadas
    protected float cargaB; //Carga torneira, chuveir, ferro elétrico e aquecedor de água de passagem
    protected float demandaB; //Demanda torneira, chuveir, ferro elétrico e aquecedor de água de passagem
    protected float cargaC; //Carga aquecedor central
    protected float demandaC; //Demanda aquecedor central
    protected float cargaD; //Carga secadora de roupa, forno elétrico, máquina de lavar louça, e forno microondas
    protected float demandaD; //Demanda secadora de roupa, forno elétrico, máquina de lavar louça, e forno microondas
    protected float cargaE; //Carga fogões elétricos
    protected float demandaE; //Demanda fogões elétricos
    protected float cargaF; //Carga condicionador de ar tipo janela
    protected float demandaF; //Demanda condicionador de ar tipo janela
    protected float cargaG; //Carga motores e máquinas de solda a motor:
    protected float demandaG; //Demanda motores e máquinas de solda a motor:
    protected float cargaH; //Carga Equipamentos Especiais
    protected float demandaH; //Demanda Equipamentos Especiais
    protected float cargaI; //Carga hidromassagem
    protected float demandaI; //Demanda hidromassagem

    //Equipamentos B
    protected int qtdChuveiro;
    protected int qtdTorneira;
    protected int qtdFerroEletrico;
    protected int qtdAquecedorDeAguaPassagem;
    protected int qtdEquipamentosB;

    //Equipamentos C
    protected int qtdAquecedorCentralAcumulacao;

    //Equipamentos D
    protected int qtdSecadora;
    protected int qtdFornoEletrico;
    protected int qtdMaquinasDeLavarLouca;
    protected int qtdMicroondas;
    protected int qtdEquipamentosD;

    //Equipamentos E
    protected int qtdFogoesEletricos;

    //Equipamentos F
    protected int qtdCondicionadorDeAr;
    protected int qtd7500BTUs;
    protected int qtd9000BTUs;
    protected int qtd10000BTUs;
    protected int qtd12000BTUs;
    protected int qtd14000BTUs;
    protected int qtd18000BTUs;
    protected int qtd21000BTUs;
    protected int qtd30000BTUs;

    //Equipamentos G
    protected int qtdMaquinasDeSolda;
    protected int qtdMotores;
    protected int qtdEquipamentosG;

    //Equipamentos H
    protected int qtdMaquinasEspeciais;

    //Equipamentos I
    protected int qtdHidromassagens;

    public float getCargaA() {
        return cargaA;
    }
    public void setCargaA(float cargaA) {
        this.cargaA = cargaA;
    }
    public float getDemandaA() {
        return demandaA;
    }
    public void setDemandaA(float demandaA) {
        this.demandaA = demandaA;
    }
    public float getCargaB() {
        return cargaB;
    }
    public void setCargaB(float cargaB) {
        this.cargaB = cargaB;
    }
    public float getDemandaB() {
        return demandaB;
    }
    public void setDemandaB(float demandaB) {
        this.demandaB = demandaB;
    }
    public float getCargaC() {
        return cargaC;
    }
    public void setCargaC(float cargaC) {
        this.cargaC = cargaC;
    }
    public float getDemandaC() {
        return demandaC;
    }
    public void setDemandaC(float demandaC) {
        this.demandaC = demandaC;
    }
    public float getCargaD() {
        return cargaD;
    }
    public void setCargaD(float cargaD) {
        this.cargaD = cargaD;
    }
    public float getDemandaD() {
        return demandaD;
    }
    public void setDemandaD(float demandaD) {
        this.demandaD = demandaD;
    }
    public float getCargaE() {
        return cargaE;
    }
    public void setCargaE(float cargaE) {
        this.cargaE = cargaE;
    }
    public float getDemandaE() {
        return demandaE;
    }
    public void setDemandaE(float demandaE) {
        this.demandaE = demandaE;
    }
    public float getCargaF() {
        return cargaF;
    }
    public void setCargaF(float cargaF) {
        this.cargaF = cargaF;
    }
    public float getDemandaF() {
        return demandaF;
    }
    public void setDemandaF(float demandaF) {
        this.demandaF = demandaF;
    }
    public float getCargaG() {
        return cargaG;
    }
    public void setCargaG(float cargaG) {
        this.cargaG = cargaG;
    }
    public float getDemandaG() {
        return demandaG;
    }
    public void setDemandaG(float demandaG) {
        this.demandaG = demandaG;
    }
    public float getCargaH() {
        return cargaH;
    }
    public void setCargaH(float cargaH) {
        this.cargaH = cargaH;
    }
    public float getDemandaH() {
        return demandaH;
    }
    public void setDemandaH(float demandaH) {
        this.demandaH = demandaH;
    }
    public float getCargaI() {
        return cargaI;
    }
    public void setCargaI(float cargaI) {
        this.cargaI = cargaI;
    }
    public float getDemandaI() {
        return demandaI;
    }
    public void setDemandaI(float demandaI) {
        this.demandaI = demandaI;
    }
    
    //Quantidades
    public int getQtdChuveiro() {
        return qtdChuveiro;
    }
    public void setQtdChuveiro(int qtdChuveiro) {
        this.qtdChuveiro = qtdChuveiro;
    }
    public int getQtdTorneira() {
        return qtdTorneira;
    }
    public void setQtdTorneira(int qtdTorneira) {
        this.qtdTorneira = qtdTorneira;
    }
    public int getQtdFerroEletrico() {
        return qtdFerroEletrico;
    }
    public void setQtdFerroEletrico(int qtdFerroEletrico) {
        this.qtdFerroEletrico = qtdFerroEletrico;
    }
    public int getQtdAquecedorDeAguaPassagem() {
        return qtdAquecedorDeAguaPassagem;
    }
    public void setQtdAquecedorDeAguaPassagem(int qtdAquecedorDeAguaPassagem) {
        this.qtdAquecedorDeAguaPassagem = qtdAquecedorDeAguaPassagem;
    }
    public int getQtdEquipamentosB() {
        return qtdEquipamentosB;
    }
    public void setQtdEquipamentosB(int qtdEquipamentosB) {
        this.qtdEquipamentosB = qtdEquipamentosB;
    }
    public int getQtdAquecedorCentralAcumulacao() {
        return qtdAquecedorCentralAcumulacao;
    }
    public void setQtdAquecedorCentralAcumulacao(int qtdAquecedorCentralAcumulacao) {
        this.qtdAquecedorCentralAcumulacao = qtdAquecedorCentralAcumulacao;
    }
    public int getQtdSecadora() {
        return qtdSecadora;
    }
    public void setQtdSecadora(int qtdSecadora) {
        this.qtdSecadora = qtdSecadora;
    }
    public int getQtdFornoEletrico() {
        return qtdFornoEletrico;
    }
    public void setQtdFornoEletrico(int qtdFornoEletrico) {
        this.qtdFornoEletrico = qtdFornoEletrico;
    }
    public int getQtdMaquinasDeLavarLouca() {
        return qtdMaquinasDeLavarLouca;
    }
    public void setQtdMaquinasDeLavarLouca(int qtdMaquinasDeLavarLouca) {
        this.qtdMaquinasDeLavarLouca = qtdMaquinasDeLavarLouca;
    }
    public int getQtdMicroondas() {
        return qtdMicroondas;
    }
    public void setQtdMicroondas(int qtdMicroondas) {
        this.qtdMicroondas = qtdMicroondas;
    }
    public int getQtdEquipamentosD() {
        return qtdEquipamentosD;
    }
    public void setQtdEquipamentosD(int qtdEquipamentosD) {
        this.qtdEquipamentosD = qtdEquipamentosD;
    }
    public int getQtdFogoesEletricos() {
        return qtdFogoesEletricos;
    }
    public void setQtdFogoesEletricos(int qtdFogoesEletricos) {
        this.qtdFogoesEletricos = qtdFogoesEletricos;
    }
    /////////////////////Equipamentos F/////////////////////
    public int getQtdCondicionadorDeAr() {
        return qtdCondicionadorDeAr;
    }
    public void setQtdCondicionadorDeAr(int qtdCondicionadorDeAr) {
        this.qtdCondicionadorDeAr = qtdCondicionadorDeAr;
    }
    ////////////////////////////por BTUs///////////////////////////
    ////////////7500BTUs////////////
    public int getQtd7500BTUs(){
        return qtd7500BTUs;
    }
    public void setQtd7500BTUs(int qtd7500BTUs){
        this.qtd7500BTUs = qtd7500BTUs;
    }
    ////////////9000BTUs////////////
    public int getQtd9000BTUs(){
        return qtd9000BTUs;
    }
    public void setQtd9000BTUs(int qtd9000BTUs){
        this.qtd9000BTUs = qtd9000BTUs;
    }
    ////////////10000BTUs////////////
    public int getQtd10000BTUs(){
        return qtd10000BTUs;
    }
    public void setQtd10000BTUs(int qtd10000BTUs){
        this.qtd10000BTUs = qtd10000BTUs;
    }
    ////////////12000BTUs////////////
    public int getQtd12000BTUs(){
        return qtd12000BTUs;
    }
    public void setQtd12000BTUs(int qtd12000BTUs){
        this.qtd12000BTUs = qtd12000BTUs;
    }
    ////////////14000BTUs////////////
    public int getQtd14000BTUs(){
        return qtd14000BTUs;
    }
    public void setQtd14000BTUs(int qtd14000BTUs){
        this.qtd14000BTUs = qtd14000BTUs;
    }
    ////////////18000BTUs////////////
    public int getQtd18000BTUs(){
        return qtd18000BTUs;
    }
    public void setQtd18000BTUs(int qtd18000BTUs){
        this.qtd18000BTUs = qtd18000BTUs;
    }
    ////////////21000BTUs////////////
    public int getQtd21000BTUs(){
        return qtd21000BTUs;
    }
    public void setQtd21000BTUs(int qtd21000BTUs){
        this.qtd21000BTUs = qtd21000BTUs;
    }
    ////////////30000BTUs////////////
    public int getQtd30000BTUs(){
        return qtd30000BTUs;
    }
    public void setQtd30000BTUs(int qtd30000BTUs){
        this.qtd30000BTUs = qtd30000BTUs;
    }
    /////////////////////Equipamentos F/////////////////////
    /////////////////////Equipamentos G/////////////////////
    public int getQtdEquipamentosG(){
        return qtdEquipamentosG;
    }
    public void setQtdEquipamentosG(int qtdEquipamentosG){
        this.qtdEquipamentosG = qtdEquipamentosG;
    }
    public int getQtdMaquinasDeSolda() {
        return qtdMaquinasDeSolda;
    }
    public void setQtdMaquinasDeSolda(int qtdMaquinasDeSolda) {
        this.qtdMaquinasDeSolda = qtdMaquinasDeSolda;
    }
    public int getQtdMotores(){
        return qtdMotores;
    }
    public void setQtdMotores(int qtdMotores){
        this.qtdMotores = qtdMotores;
    }
    /////////////////////Equipamentos G/////////////////////
    /////////////////////Equipamentos H/////////////////////
    public int getQtdMaquinasEspeciais() {
        return qtdMaquinasEspeciais;
    }
    public void setQtdMaquinasEspeciais(int qtdMaquinasEspeciais) {
        this.qtdMaquinasEspeciais = qtdMaquinasEspeciais;
    }
    /////////////////////Equipamentos H/////////////////////
    /////////////////////Equipamentos I/////////////////////
    public int getQtdHidromassagens() {
        return qtdHidromassagens;
    }
    public void setQtdHidromassagens(int qtdHidromassagens) {
        this.qtdHidromassagens = qtdHidromassagens;
    }
    /////////////////////Equipamentos I/////////////////////
    
    
}