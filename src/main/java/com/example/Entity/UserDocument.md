*************************************************************************************************
                             Lombok Nedir ?

Lombok, Java projesi geliştirirken IDE’ye entegre edilebilen bir anotasyon

ile kod üretme (code generation) kütüphanesidir. Lombok ile daha temiz ve

daha az kod yazmış oluruz.Java’da proje geliştirirken yaygın olarak yapmamız

gereken bazı işlemler bulunmakta. Bunlar projemizin iş tarafına gerçek bir değer

getirmez iken kodumuzun çok fazla ayrıntı barındırmasını zorunlu hale getiriyor.

Örnek olarak Bir POJOda (Plain Old Java Object) Sürekli Get-Set, Constructor,

toString vb. methodları yazmamız gerekiyor. Birçok sınıfta olması gereken bu methodlar

o kadar uzuyor ki sınıfların uzunluğu ve kod karmaşıklığı artıyor, clean code’dan uzaklaşıyoruz.

Tam da burada Lombok hayatımıza giriyor. Yazılım geliştirirken kendimizi daha mutlu ve üretken

hale getirmek için tercih sebebimiz oluyor.

******************************************************************************************************

Şimdi sıklıkla kullanılan Lombok anotasyonlarına ve ne yaptıklarına bir bakalım;

- @Getter: Ait olduğu alanın get methodunu oluşturulmuş olur.

- @Setter: Aynı şekilde anatosyonu olduğu fieldin setter methodunu oluşturur.

- @Data : @Getter + @Setter işlemlerini ve bunun yanında toString ve EqualsAndHashCode

methodların yaptığı işlemleri yapar. Sınıfın üstüne eklenen bir anatosyondur.

Sınıf içindeki tüm field lerin getter ve setter methodlarını oluşturur.

POJO larda ve Modellerde genellikle tercih edilir.

- @AllArgsConstructor: Sınıfın Constructorını üretir.Bu Constructor sınıftaki tüm fieldleri parametre olarak almıştır.

- @NoArgsConstructor: Parametresiz Constructor üretir.

- @NonNull : Bu anatosyan ile null kontrolü yapabiliriz.@NonNull notasyonu null gelen değer için

NullPointerException fırlatmaktadır.

******************************************************************************************************