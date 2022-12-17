/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io.github.pedromedeiros2.virtualstore.carregardados;

import io.github.pedromedeiros2.virtualstore.categoria.Categoria;
import io.github.pedromedeiros2.virtualstore.categoria.CategoriaServiceLocal;
import io.github.pedromedeiros2.virtualstore.credencial.Credencial;
import io.github.pedromedeiros2.virtualstore.credencial.CredencialServiceLocal;
import io.github.pedromedeiros2.virtualstore.item.Item;
import io.github.pedromedeiros2.virtualstore.item.ItemServiceLocal;
import io.github.pedromedeiros2.virtualstore.pedido.Pedido;
import io.github.pedromedeiros2.virtualstore.pedido.PedidoServiceLocal;
import io.github.pedromedeiros2.virtualstore.produto.Produto;
import io.github.pedromedeiros2.virtualstore.produto.ProdutoServiceLocal;
import io.github.pedromedeiros2.virtualstore.usuario.Usuario;
import java.time.LocalDate;
import java.time.Month;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;

/**
 *
 * @author Daniel Alves<gatosfofos3 at gmail.com>
 */
@Singleton
@Startup
public class CarregarDados implements CarregarDadosLocal{

    @Inject
    private CategoriaServiceLocal categoriaService;
    
    @Inject
    private CredencialServiceLocal credencialService;
    
    @Inject
    private ItemServiceLocal itemService;
    
    @Inject
    private PedidoServiceLocal pedidoService;
 
    @Inject
    private ProdutoServiceLocal produtoService;
    
    //Play Store
    private String descricaoPlayStore = "O vale-presente Google Play te dá acesso a um mundo de entretenimento. É muito fácil encontrar algo que você goste, seja você um fã de filmes, livros, apps ou jogos. Tudo em um só lugar e a qualquer hora. Aproveite o melhor do entretenimento em smartphones, tablets, Chromecast e também no computador. O pagamento é fácil e rápido, você não precisa de um cartão de crédito e o saldo não expira. Compre para alguém especial ou para você mesmo.\nUm presente. Infinitas possibilidades de aproveitá-lo.";
    private String imagemPlayStore = "https://cdn.sistemawbuy.com.br/arquivos/91a41ab2609d6d45f22a680112b17671/produtos/BOU9LEI2/google-play-2-60e274f8a2b49.png";
    
    //Steam Store
    private String DescricaoSteamStore = "Steam é uma plataforma de jogos, onde você pode encontrar mais de 30.000 jogos, indo de grandes produções até pequenos independentes – com bastante coisa no meio. Aproveite as promoções exclusivas, atualizações automáticas e outros grandes privilégios. Ofereça o PIN Steam como presente também.";
    private String imagemSteamStore = "https://www.mygiftcardsupply.com/wp-content/uploads/2022/01/buy-steam-gift-card-online.png";
    
    //XBOX
    private String DescricaoXboxStore = "Com um cartão-presente do Xbox, o jogador tem a liberdade de escolher o presente que quiser – mesmo se o jogador for você.Ele pode ser usado para comprar os melhores e mais novos downloads de jogos completos para Xbox, apps e muito mais.Não é preciso se preocupar com tarifas nem datas de expiração.O código de presente digital é válido para compras na Microsoft Store online, no Windows e no Xbox.";
    private String imagemXboxStore = "https://cdn.sistemawbuy.com.br/arquivos/91a41ab2609d6d45f22a680112b17671/produtos/SOU9REI7/carta-o-presente-xbox-ocean-game-618c04e3a258a.png";
    
    //PLAY Station
    private String DescricaoPlaySationStore = " Recarregue o saldo da sua Carteira na Playstation Store de um jeito rápido e prático para aproveitar uma biblioteca cujo acervo aumenta a cada dia.Adquira jogos que são sucesso no mundo inteiro ou amplie sua diversão com diversas DLCs.Como Resgatar: Adquirir seu crédito é muito fácil! Após concluir a compra deste produto, você receberá um link direto para o Hype.Games.No Hype, alguns dados, como nome, CPF e e-mail, serão solicitados para concluir o seu resgatApós informar os dados cadastrais, você receberá a chave digital do seu produto e o link da plataforma para ativação. Aí é só ativar sua chave e partir para a jogatina!IMPORTANTE: Ao fazer o resgate no site Hype você não poderá mais pedir reembolso.O usuário deverá usar a chave recebida para resgatar o produto na plataforma específica e os créditos estarão disponíveis em sua conta.Após a visualização da chave no aplicativo, não há como realizar estorno do pedido.Depois de inserido, os créditos não poderão ser estornadosEste produto é válido apenas para cntas da região Brasil.A Sony Interactive Entertainment LLC, suas empresas controladores, empresas afiliadas e licenciantes não fazem garantias expressas ou implícitas com relação ao cartão, a PSN ou a disponibilidade de produtos e serviços.Na medida permitida por lei, a sua única e exclusiva solução é a substituição do cartão.Os termos do cartão podem ser alterados semaviso prévio.Sem validade onde proibido ou restrito por lei.Para obter ajuda, entre em cono com suporte.br.playstation.com.";
    private String imagemPlaySationStore = "https://www.meumonte.com.br/imagem/index/30887761/G/ps_plus_gift_card_image_block_01_en_21oct21.jpg";
    
    @Override
    public void popularBanco() {
        
        //CATEGORIAS
        Categoria categoria1 = new Categoria("MOBILE");
        Categoria categoria2 = new Categoria("PC");
        Categoria categoria3 = new Categoria("CONSOLE");
        
        
        //GiftCard R$10,00 PlayStore        
        Produto playstore1 = new Produto("Gift Card Google Play: 10 Reais - Cartão Presente Digital", descricaoPlayStore,imagemPlayStore , 24 , 10.00f , categoria1);
        //GiftCard R$30,00 PlayStore        
        Produto playstore2 = new Produto("Gift Card Google Play: 30 Reais - Cartão Presente Digital", descricaoPlayStore,imagemPlayStore, 13 , 30.00f , categoria1);
        //GiftCard R$50,00 PlayStore        
        Produto playstore3 = new Produto("Gift Card Google Play: 50 Reais - Cartão Presente Digital", descricaoPlayStore,imagemPlayStore, 22 , 50.00f , categoria1);
        //GiftCard R$100,00 PlayStore        
        Produto playstore4 = new Produto("Gift Card Google Play: 100 Reais - Cartão Presente Digital", descricaoPlayStore,imagemPlayStore, 56 , 100.00f , categoria1);
        
        //GiftCard R$20,00 steamStore        
        Produto SteamStore1 = new Produto("Gift Card Steam Store: 20 Reais - Cartão Presente Digital", DescricaoSteamStore,imagemSteamStore , 16 , 20.00f , categoria2);
        //GiftCard R$50,00 steamStore        
        Produto SteamStore2 = new Produto("Gift Card Steam Store: 50 Reais - Cartão Presente Digital", DescricaoSteamStore,imagemSteamStore , 86 , 50.00f , categoria2);
        //GiftCard R$100,00 steamStore        
        Produto SteamStore3 = new Produto("Gift Card Steam Store: 100 Reais - Cartão Presente Digital", DescricaoSteamStore,imagemSteamStore , 37 , 100.00f ,categoria2);
        
        //GiftCard R$50,00 xboxStore        
        Produto xBoxStore1 = new Produto("Gift Card Xbox: 50 Reais - Código Digital", DescricaoXboxStore,imagemXboxStore , 32 , 50.00f , categoria3);
        //GiftCard R$100,00 xboxStore        
        Produto xBoxStore2 = new Produto("Gift Card Xbox: 100 Reais - Código Digital", DescricaoXboxStore,imagemXboxStore , 2 , 100.00f , categoria3);
        
        //GiftCard R$50,00 playstation        
        Produto playStationStore1 = new Produto("Gift Card PlayStation Store R$50 - Cartão Presente Digital", DescricaoPlaySationStore,imagemPlaySationStore , 120 , 50.00f , categoria3);
        //GiftCard R$100,00 playstation        
        Produto playStationStore2 = new Produto("Gift Card PlayStation Store R$100 - Cartão Presente Digital", DescricaoPlaySationStore,imagemPlaySationStore , 10 , 100.00f , categoria3);
        //GiftCard R$250,00 playstation        
        Produto playStationStore3 = new Produto("Gift Card PlayStation Store R$250 - Cartão Presente Digital", DescricaoPlaySationStore,imagemPlaySationStore , 4 , 250.00f ,categoria3);
        
        
        // CREDENCIAL 
        Credencial credencial1 = new Credencial("pedroMedeiro@gm","123456",false);
        Credencial credencial2 = new Credencial("danielA@gm","123456",false);
        Credencial credencial3 = new Credencial("dd821@gm","654321",false);
        Credencial credencial4 = new Credencial("ADM01@gm","admin",true);
        Credencial credencial5 = new Credencial("ADM02@gm","admin",true);
        Credencial credencial6 = new Credencial("alooo@gm","123abc",false);
        
        //usuarios
        Usuario usuario1 = new Usuario("Pedro Medeiros", credencial1);
        Usuario usuario2 = new Usuario("Daniel Alves", credencial2);
        Usuario usuario3 = new Usuario("Debora Dinarquesa", credencial3);
        Usuario usuario4 = new Usuario("Potter", credencial4);
        Usuario usuario5 = new Usuario("Harry", credencial5);
        Usuario usuario6 = new Usuario("Jefferson", credencial6);
        
        //vincular credencial com usuarios
        credencial1.setUsuario(usuario1);
        credencial2.setUsuario(usuario2);
        credencial3.setUsuario(usuario3);
        credencial4.setUsuario(usuario4);
        credencial5.setUsuario(usuario5);
        credencial6.setUsuario(usuario6);
        
        
        //usuario 1 
        //pedidos --> pedido1U1 = pedido 1 do usuario 1  && item1P1U1 = item 1 do pedido 1 do usuario 1
        Pedido pedido1U1 = new Pedido("Cartão", LocalDate.of(2022, Month.FEBRUARY, 2), 22.00f , usuario1);
        Item item1P1U1 = new Item(20.00f,2,playstore1,pedido1U1);
        pedido1U1.setItens(item1P1U1);
        
        //nesse exemplo o mesmo usuario 1 fez um segundo pedido que tinha 2 itens , 1 desses itens tinha 2 unidade do produto
        Pedido pedido2U1 = new Pedido("Cartão", LocalDate.of(2022, Month.APRIL, 20), 155.00f , usuario1);
        Item item1P2U1 = new Item(50.00f,1,playstore3,pedido2U1);
        Item item2P2U1 = new Item(100.00f,2,SteamStore2,pedido2U1);
        pedido2U1.setItens(item1P2U1);
        pedido2U1.setItens(item2P2U1);
        
        //usuario 2
        Pedido pedido1U2 = new Pedido("Cartão", LocalDate.of(2022, Month.APRIL, 20), 460.00f , usuario2);
        Item item1P1U2 = new Item(250.00f,1,playStationStore3,pedido1U2);
        Item item2P1U2 = new Item(50.00f,4,xBoxStore1,pedido1U2);
        pedido1U2.setItens(item1P1U2);
        pedido1U2.setItens(item2P1U2);
        
        
        Pedido pedido2U2 = new Pedido("Cartão", LocalDate.of(2022, Month.APRIL, 22), 208.40f , usuario2);
        Item item1P2U2 = new Item(20.00f,1,SteamStore1,pedido2U2);
        Item item2P2U2 = new Item(50.00f,1,SteamStore2,pedido2U2);
        Item item3P2U2 = new Item(100.00f,1,SteamStore3,pedido2U2);
        Item item4P2U2 = new Item(30.00f,1,playstore2,pedido2U2);
        pedido2U2.setItens(item1P2U2);
        pedido2U2.setItens(item2P2U2);
        pedido2U2.setItens(item3P2U2);
        pedido2U2.setItens(item4P2U2);
        
        
        //usuario 3
        Pedido pedido1U3 = new Pedido("Pix", LocalDate.of(2022, Month.MAY, 6), 22.00f , usuario3);
        Item item1P1U3 = new Item(20.00f,1,playstore1,pedido1U3);
        pedido1U3.setItens(item1P1U3);
        
        //usuario 6 
        Pedido pedido1U6 = new Pedido("Boleto", LocalDate.of(2022, Month.JUNE, 17), 205.50f , usuario6);
        Item item1P1U6 = new Item(50.00f,2,playStationStore1,pedido1U6);
        Item item2P1U6 = new Item(100.00f,1,playStationStore2,pedido1U6);
        pedido1U6.setItens(item1P1U6);
        pedido1U6.setItens(item2P1U6);
        
    }
    
}
