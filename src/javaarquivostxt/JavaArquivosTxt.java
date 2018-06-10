package javaarquivostxt;

/**
 * @author LUCAS FERNANDO DE ASSIS
 */
public class JavaArquivosTxt {

    public static void main(String[] args) {
        //Gravação
        String arq = "teste.txt";
        String texto = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam nec est tincidunt, dignissim risus ac, euismod libero. Donec gravida, nisi nec ornare sagittis, eros diam gravida orci, vel laoreet ante dolor vel nisi. Quisque dapibus malesuada porta. Nulla hendrerit at velit non lacinia. Nunc facilisis lobortis rutrum. Nullam ornare ex sed purus ultricies, ac vehicula tortor porta. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Vestibulum eget erat feugiat, vulputate tellus eget, vulputate eros. Vivamus id consectetur eros. In ultrices venenatis mi in aliquam. Proin non turpis libero. Etiam ultricies non mauris eget fringilla. Cras malesuada lacus tincidunt, vestibulum tellus eu, semper nisi. Curabitur nec dignissim nisl, in aliquam lacus. Aliquam sit amet tincidunt odio. Mauris sagittis dictum leo, non ullamcorper ante rhoncus a.\r\n"
                + "\r\n"
                + "Morbi diam lorem, consectetur vitae dapibus id, consectetur a risus. Sed scelerisque nulla quis tellus rhoncus, quis fringilla quam iaculis. Pellentesque ullamcorper odio eget lacus euismod faucibus. Praesent sit amet nulla egestas, feugiat ipsum eget, consequat ex. In bibendum ligula nec vestibulum venenatis. Quisque sollicitudin commodo neque at molestie. Pellentesque laoreet ut elit scelerisque tempus. Phasellus eget ullamcorper risus. Quisque urna nulla, sagittis nec bibendum id, vulputate vitae lorem. Donec id elit aliquet, imperdiet ligula quis, elementum metus. Aenean sed vehicula turpis, in posuere dui. In lobortis felis lectus, vitae lobortis diam volutpat in. Nam rutrum molestie justo eget tempor. Pellentesque tellus metus, lobortis ac urna accumsan, lacinia faucibus libero. Curabitur scelerisque ipsum fermentum purus luctus vehicula.\r\n"
                + "\r\n"
                + "Nulla maximus orci purus, ac dictum enim luctus nec. Nulla molestie faucibus mattis. Praesent sed tincidunt diam. Suspendisse nisi eros, ultrices vel ultricies sit amet, tincidunt id lectus. Vestibulum viverra, velit ac ultrices iaculis, lorem eros ornare augue, a ullamcorper nibh purus a tellus. Ut eros mauris, iaculis sed enim vitae, iaculis condimentum sem. Donec maximus diam ut nisl mattis interdum. In ultricies luctus arcu, id dapibus mauris varius a. Curabitur vitae lectus non ipsum consectetur pulvinar id in sapien. In ultricies, enim ornare pulvinar tincidunt, justo mauris maximus risus, sed laoreet ante urna in libero. Aliquam ullamcorper auctor dapibus. Nulla id pellentesque diam. Suspendisse dictum eget erat et ultrices. Donec congue ultrices neque pellentesque laoreet.\r\n"
                + "\r\n"
                + "Morbi vehicula finibus urna et congue. Mauris vestibulum leo quam. Nulla in velit est. Ut sodales risus ac malesuada ultricies. Fusce semper nibh ac est eleifend, id scelerisque nibh volutpat. Maecenas maximus ullamcorper magna, at efficitur est tempus sed. Vestibulum ligula leo, aliquet non nibh eu, laoreet maximus eros. Maecenas vulputate ut ligula nec condimentum. Sed convallis vehicula maximus. Sed quis sem et felis tempus rhoncus.\n"
                + "\r\n"
                + "Phasellus fermentum libero faucibus eros imperdiet, eu commodo ex tincidunt. Praesent dapibus nibh quis erat iaculis placerat. Morbi consequat interdum tempor. Mauris pulvinar magna ullamcorper diam vulputate, vel finibus est porttitor. Mauris mollis condimentum vehicula. Vestibulum mauris dui, mollis eu ultrices ac, interdum et odio. Suspendisse eget turpis venenatis, pharetra odio in, accumsan enim. Interdum et malesuada fames ac ante ipsum primis in faucibus. Pellentesque at facilisis eros, sit amet euismod elit. Mauris quam neque, congue eget lorem et, tincidunt pretium felis. Curabitur ac dignissim ipsum. Aenean ultricies interdum justo, sit amet pulvinar lacus iaculis nec. Nunc fermentum libero tristique purus eleifend, tincidunt luctus eros convallis. Duis tempor euismod diam ac tincidunt. Nunc euismod augue ut ante venenatis rutrum.";

        if (Arquivo.Write(arq, texto)) {
            System.out.println("Arquivo salvo com sucesso");
        } else {
            System.out.println("Erro ao salvar o arquivo");
        }

        //Leitura
        String textoLido = Arquivo.Read(arq);
        if (textoLido.contains("Erro")) {
            System.out.println("Algo deu errado: \r\n: " + texto);
        } else {
            System.out.println(textoLido);
        }

        String arqConfig = "conf.con";
        String nome = "Gilberto";
        String login = "Admin";
        String versao = "0.0.1";

        String print = nome + ";" + login + ";" + versao;
        Arquivo.Write(arqConfig, print);

        String conteudo = Arquivo.Read(arqConfig);
        String[] dados = conteudo.split(";");
        System.out.println("Nome: " + dados[0] + "\nLogin: " + dados[1] + " \nVersão: " + dados[2]);
    }

}
