FROM postgres:latest
RUN localedef -i ja_JP -c -f UTF-8 -A /usr/share/locale/locale.alias ja_JP.UTF-8
ENV LANG ja_JP.UTF-8
# コンテナ作成時に、DB_init内のsqlを実行するため
COPY ./*.sql /docker-entrypoint-initdb.d/
# DB接続用ポート解放
EXPOSE 5432
# 環境変数
ENV TEST_VAL testbal/bal/fdkaoj
ENV ST_VAL testbal/bal/fdkaoj
