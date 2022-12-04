/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io.github.pedromedeiros2.virtual_store.carregar_dados;

import io.github.pedromedeiros2.virtual_store.categoria.Categoria;
import io.github.pedromedeiros2.virtual_store.categoria.CategoriaServiceLocal;
import io.github.pedromedeiros2.virtual_store.credencial.CredencialServiceLocal;
import io.github.pedromedeiros2.virtual_store.cupom.CupomServiceLocal;
import io.github.pedromedeiros2.virtual_store.item.ItemServiceLocal;
import io.github.pedromedeiros2.virtual_store.pedido.PedidoServiceLocal;
import io.github.pedromedeiros2.virtual_store.produto.Produto;
import io.github.pedromedeiros2.virtual_store.produto.ProdutoServiceLocal;
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
    private CupomServiceLocal cupomService;
    
    @Inject
    private ItemServiceLocal itemService;
    
    @Inject
    private PedidoServiceLocal pedidoService;
 
    @Inject
    private ProdutoServiceLocal produtoService;
    
    //PlayStore
    private String descricaoPlayStore = "O vale-presente Google Play te dá acesso a um mundo de entretenimento. É muito fácil encontrar algo que você goste, seja você um fã de filmes, livros, apps ou jogos. Tudo em um só lugar e a qualquer hora. Aproveite o melhor do entretenimento em smartphones, tablets, Chromecast e também no computador. O pagamento é fácil e rápido, você não precisa de um cartão de crédito e o saldo não expira. Compre para alguém especial ou para você mesmo.\nUm presente. Infinitas possibilidades de aproveitá-lo.";
    private String imagemPlayStore = "https://cdn.sistemawbuy.com.br/arquivos/91a41ab2609d6d45f22a680112b17671/produtos/BOU9LEI2/google-play-2-60e274f8a2b49.png";
    
    //SteamStore
    private String DescricaoSteamStore = "Steam é uma plataforma de jogos, onde você pode encontrar mais de 30.000 jogos, indo de grandes produções até pequenos independentes – com bastante coisa no meio. Aproveite as promoções exclusivas, atualizações automáticas e outros grandes privilégios. Ofereça o PIN Steam como presente também.";
    private String imagemSteamStore = "https://www.mygiftcardsupply.com/wp-content/uploads/2022/01/buy-steam-gift-card-online.png";
    
    //SteamStore
    private String DescricaoXboxStore = "Com um cartão-presente do Xbox, o jogador tem a liberdade de escolher o presente que quiser – mesmo se o jogador for você.Ele pode ser usado para comprar os melhores e mais novos downloads de jogos completos para Xbox, apps e muito mais.Não é preciso se preocupar com tarifas nem datas de expiração.O código de presente digital é válido para compras na Microsoft Store online, no Windows e no Xbox.";
    private String imagemXboxStore = "https://cdn.sistemawbuy.com.br/arquivos/91a41ab2609d6d45f22a680112b17671/produtos/SOU9REI7/carta-o-presente-xbox-ocean-game-618c04e3a258a.png";
    
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
        
        //GiftCard R$00,00 playstation        
        Produto playStationStore1 = new Produto("Gift Card PlayStation Store R$50 - Cartão Presente Digital", DescricaoPlaySationStore,imagemPlaySationStore , 120 , 50.00f , categoria3);
        //GiftCard R$00,00 playstation        
        Produto playStationStore2 = new Produto("Gift Card PlayStation Store R$100 - Cartão Presente Digital", DescricaoPlaySationStore,imagemPlaySationStore , 10 , 100.00f , categoria3);
        //GiftCard R$00,00 playstation        
        Produto playStationStore3 = new Produto("Gift Card PlayStation Store R$250 - Cartão Presente Digital", DescricaoPlaySationStore,imagemPlaySationStore , 4 , 250.00f ,categoria3);
        
        
        
    }
    
}
