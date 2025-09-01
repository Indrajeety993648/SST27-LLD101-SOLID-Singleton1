import com.example.profiles.*;

public class TryIt {
    public static void main(String[] args) {
        ProfileService svc = new ProfileService();
        UserProfile p = svc.createMinimal("u1", "a@b.com");
        System.out.println("Email: " + p.getEmail());

        // To update a field, create a new immutable object
        UserProfile updated = new UserProfile.Builder()
                .id(p.getId())
                .email("evil@example.com")
                .phone(p.getPhone())
                .displayName(p.getDisplayName())
                .address(p.getAddress())
                .marketingOptIn(p.isMarketingOptIn())
                .twitter(p.getTwitter())
                .github(p.getGithub())
                .build();
        System.out.println("Updated Email: " + updated.getEmail());
        System.out.println("=> In the solution, setters disappear and object becomes immutable.");
    }
}
