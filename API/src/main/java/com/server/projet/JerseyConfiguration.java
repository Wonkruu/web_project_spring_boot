package com.server.projet;

import com.server.projet.ressources.artist.ArtistController;
import com.server.projet.ressources.song.SongController;
import com.server.projet.ressources.user.UserController;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.servlet.ServletProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import javax.ws.rs.ApplicationPath;

@Component
@ApplicationPath("")
@Configuration
public class JerseyConfiguration extends ResourceConfig {
    public JerseyConfiguration() {
        register(SongController.class);
        register(UserController.class);
        register(ArtistController.class);
        register(CORSResponseFilter.class);
        property(ServletProperties.FILTER_FORWARD_ON_404, true);
    }
}