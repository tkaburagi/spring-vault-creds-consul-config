package run.kabuctl.vaultcredsfs;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;

public class MysqlCreds {
    public String[] getCreds() throws Exception {
        JSONParser parser = new JSONParser();
        Object object = parser.parse(new FileReader("/Users/kabu/hashicorp/intellij/vault-db-creds-fs/mysql-creds.json"));
        JSONObject jsonObject = (JSONObject) object;
        JSONObject jsonObject1 = (JSONObject) jsonObject.get("data");
        String password = jsonObject1.get("password").toString();
        String username = jsonObject1.get("username").toString();

        String creds[] = { username, password };

        return creds;
    }
}
