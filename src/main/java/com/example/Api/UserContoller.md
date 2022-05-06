********************************************************************

- @RequiredArgsConstructor: Class içinde final ve NonNull olan değişkenleri

parametre olarak alan bir constructor oluşturur.

- @ToString: ToString annotasyonu, sınıf seviyesinde toString metodunu oluşturmaktadır.

********************************************************************

@RequiredArgsConstructor ya bunu kullanacağız ya da

public UserController(UserRepository userRepository) {
this.userRepository = userRepository;
}

bunu .

********************************************************************

             Spring MVC de @PathVariable ve @RequestParam ?

@PathVariable ve @RequestParam anotasyonları gönderilen isteğin içindeki parametrelerdir.
Ortak yönü her ikisininde parametre olmasıdır. Biz bu anotasyonların farkları üzerinde duracağız.
Eğer elimizde bir url template varsa bu durumda @PathVariable kullanımı gayet uygundur.
Diğer durumlar içinse @RequestParam daha kullanışlıdır. Konunun örnekler ile daha kolay
anlaşılabileceği kanısındayım. Bundan dolayı, hemen örneklere geçiyorum.

Öncelikle @PathVariable örnekleri ile başlayalım.

http://localhost:8080/movies
(/movies)
Bu istek tüm filmlerin listesini döner.

http://localhost:8080/movies/1
(/movies/{movieId})
Bu istek id si 1 olan filmi döner.

http://localhost:8080/movies/1/stars
(/movies/{movieId}/stars)
Bu istek id si 1 olan filmin oyuncularının listesini döner.

http://localhost:8080/movies/1/stars/2 (/movies/{movieId}/stars/{starId})
Bu istek id si 1 olan filmin oyuncularından id si 2 olanı döner.

Dikkat ettiyseniz, bağlantı adresi bir template halindedir. Toplamda 4 metot mevcuttur.

@RequestParam örneğini inceleyelim.

Bu örnekte tek bir metot mevcuttur.

http://localhost:8080/movies/search
Filtresi tüm kayıtları getirir.

http://localhost:8080/movies/search?name=saw
İstediğimiz parametreleri sorguya dahil edebiliriz. Parametreleri zorunlu veya isteğe bağlı
yapabileceğimiz gibi onlara default değer de verebiliriz.

http://localhost:8080/movies/search?name=saw&country=ABD
Film adı saw olan ve ABD yapımı olan filmleri getirir.