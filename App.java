import java.util.Scanner;

public class App {
	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		int selected;
		GaragemLocomotivas garagemLocomotivas = new GaragemLocomotivas();
		GaragemVagoes garagemVagoes = new GaragemVagoes();
		PatioDeManobras patioDeManobras = new PatioDeManobras();
		do {
			System.out.println("---- MENU ----");
			System.out.println("1 - Cria trem");
			System.out.println("2- Edita trem");
			System.out.println("3- Listar todos os trens já criados");
			System.out.println("4- Desfazer um trem");
			System.out.println("5 - Fim do programa");
			selected = in.nextInt();
			switch (selected) {
				case 1:
					System.out.println("Digite a id do trem");
					int id = in.nextInt();
					Trem trem = new Trem(id);
					System.out.println("Selecione uma locomotiva ");
					for (int i = 0; i < garagemLocomotivas.qtdade(); i++) {
						System.out.println(garagemLocomotivas.getPorPosicao(i));
					}
					int locomotivaPos = in.nextInt();
					Locomotiva newLocomotiva = garagemLocomotivas.getPorId(locomotivaPos);
					trem.engataLocomotiva(newLocomotiva);
					patioDeManobras.adicionaPatio(trem);
					System.out.println("Trem criado com sucesso");
					break;
				case 2:
					int editAction = -1;
					System.out.println("Trens para editar");
					for (int i = 0; i < patioDeManobras.qtdade(); i++) {
						System.out.println(patioDeManobras.getPorPosicao(i));
					}
					System.out.println("digite a id do trem que ira ser editado");
					int editId = in.nextInt();
					Trem editTrem = patioDeManobras.getPorId(editId);
					do {
						System.out.println("Digite o que voce quer fazer com o trem");
						System.out.println("1 - Insere locomotiva");
						System.out.println("2 - Insere vagão");
						System.out.println("3 - Remove ultimo elemento do trem");
						System.out.println("4 - Listar locomotivas livres");
						System.out.println("5 - Listar vagoes livres");
						System.out.println("6 - Fim da edição");
						editAction = in.nextInt();
						switch (editAction) {
							case 1:
								System.out.println("Selecione uma locomotiva ");
								for (int i = 0; i < garagemLocomotivas.qtdade(); i++) {
									System.out.println(garagemLocomotivas.getPorPosicao(i));
								}
								int locomotivaId = in.nextInt();
								Locomotiva locomotivaToInsert = garagemLocomotivas.getPorId(locomotivaId);
								editTrem.engataLocomotiva(locomotivaToInsert);
								break;
							case 2:
								for (int i = 0; i < garagemVagoes.qtdade(); i++) {
									System.out.println(garagemVagoes.getPorPosicao(i));
								}
								System.out.println("Selecione um vagão");
								int vagaoId = in.nextInt();
								Vagao vagaoToInsert = garagemVagoes.getPorId(vagaoId);
								editTrem.engataVagao(vagaoToInsert);
								break;
							case 3:
								System.out.println("Removendo Ultimo Elemento do trem");
								if (editTrem.getQtdadeVagões() > 0) {
									if (editTrem.desengataVagao())
										System.out.println("Vagão desengatado");
									else
										System.out.println("Não tem vagao");
								} else {
									if (editTrem.desengataLocomotiva())
										System.out.println("Locomotiva desengatada");
									else
										System.out.println("Não tem locomotiva");
								}
								break;
							case 4:
								System.out.println("Listando Locomotivas livres");
								for (int i = 0; i < garagemLocomotivas.qtdade(); i++) {
									System.out.println(garagemLocomotivas.getPorPosicao(i));
								}
								break;
							case 5:
								System.out.println("Listando Vagoes livres");
								for (int i = 0; i < garagemVagoes.qtdade(); i++) {
									System.out.println(garagemVagoes.getPorPosicao(i));
								}
								break;
						}

					} while (editAction != 6);
					break;
				case 3:
					System.out.println("Listando Trens");
					for (int i = 0; i < patioDeManobras.qtdade(); i++) {
						System.out.println(patioDeManobras.getPorPosicao(i));
					}
					break;
				case 4:
					System.out.println("Digite a id do trem que voce quer desfazer");
					int idRemove = in.nextInt();
					Trem tremToRemove = patioDeManobras.getPorId(idRemove);
					for (int i = 0; i < tremToRemove.getQtdadeVagões(); i++) {
						tremToRemove.desengataVagao();
					}
					for (int i = 0; i < tremToRemove.getQtdadeLocomotivas(); i++) {
						tremToRemove.getLocomotiva(i).setTrem(null);
						tremToRemove.desengataLocomotiva();
					}
					patioDeManobras.removePatio(tremToRemove.getID());
					break;
			}
		} while (selected != 5);
	}
}